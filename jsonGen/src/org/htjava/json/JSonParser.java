package org.htjava.json;

public class JSonParser {

	int idx=0;
	String s=null;
	char cur;
	public JSonParser(String s) {
		this.s=s;
		cur=s.charAt(idx);
	
	}
	
	final static String toSkip=" \t\r\n";
	
	private void next() throws JSonParseEx {
		idx++;
		if (idx<s.length()) 
			cur=s.charAt(idx);
		else if (idx==s.length()) 
			cur='\0';
		else 
			throw new JSonParseEx();
	}
	
	private void skip() throws JSonParseEx {
		while (toSkip.indexOf(cur)>=0 && idx<s.length()-1)  {
			next();
		}
	}
	
	private void nextskip() throws JSonParseEx {
		next();
		skip();
	}
	
	private Label parseLabel() throws JSonParseEx {
		StringBuilder nome=new StringBuilder(32);
		skip();
		if (cur!='"') {
			throw new JSonParseEx();
		}
		next();
		while (cur!='"') {
			nome.append(cur);
			next();
		}
		nextskip();
		return new Label(nome.toString());
	}
	
	private JSonConstant parseConstant(JSonConstant cons) throws JSonParseEx {
		
		for (int cidx=0;cidx<cons.length();cidx++) {
			if (cur!=cons.charAt(cidx))
				throw new JSonParseEx();
			next();
		}
		skip();
		return cons;
	}
	
	
	private JSonString parseString() throws JSonParseEx {
		StringBuilder nome=new StringBuilder(32);
		if (cur!='"') {
			throw new JSonParseEx();
		}
		next();
		while (cur!='"') {
			if (cur=='\\') {
				next();
				if (cur=='\\') 
					nome.append('\\');
				else if (cur=='r') 
					nome.append('\r');
				else if (cur=='n') 
					nome.append('\n');
				else if (cur=='f')
					nome.append('\f');
				else if (cur=='t')
					nome.append('\t');
				else if (cur=='/')
					nome.append('/');
				else if (cur=='"')
					nome.append('"');
				else if (cur=='\'')
					nome.append('\'');
				else if (cur=='u') {
					char charsExa[]=new char[4];
					for (int i=0;i<4;i++) {
						next();
						charsExa[i]=cur;
					}
					String strExa=String.valueOf(charsExa);
					int valExa;
					try {
						valExa=Integer.parseInt(strExa, 16);
					}
					catch (Exception e) {
						throw new JSonParseEx();
					}
					nome.append((char)valExa);
				}
				else
					throw new JSonParseEx();
			}
			else {
				nome.append(cur);
			}
			next();
		}
		nextskip();
		return new JSonString(nome.toString());
	}
	
	private JSonElem parseNumber() throws JSonParseEx {
		StringBuilder nome=new StringBuilder(16);
		boolean decimal=false;
		while (Character.isDigit(cur) || cur=='.' || cur=='+'|| cur=='-'|| cur=='e'|| cur=='E') {
			if (!Character.isDigit(cur))
				decimal=true;
			
			nome.append(cur);
			next();
		}
		JSonElem res;
		
		if (decimal) { 
			res= new JSonNumber(Double.parseDouble(nome.toString()));
		}
		else {
			try {
				res= new JSonInteger(Integer.parseInt(nome.toString()));
			}
			catch (Exception e) {
				res= new JSonLong(Long.parseLong(nome.toString()));
			}
		}
		skip();
		return res;
	}
	
	private NameValue parseNameValue() throws JSonParseEx {
		
		Label l=parseLabel();
		if (cur!=':') {
			throw new JSonParseEx();
		}
		nextskip();
		JSonElem el=parseElem();
		skip();
		
		return new NameValue(l, el);
	}
	
	private JSonObj parseObj() throws JSonParseEx {
		JSonObj res=new JSonObj();
		nextskip();
		while (cur!='}') {
			NameValue nv=parseNameValue();
			res.add(nv);
			if (cur==',')
				nextskip();
		}
		nextskip();
		return res;
	}
	private JSonArray parseArray() throws JSonParseEx {
		JSonArray res=new JSonArray();
		nextskip();
		while (cur!=']') {
			JSonElem el=parseElem();
			res.add(el);
			if (cur==',')
				nextskip();
		}
		nextskip();
		return res;
	}
	
	private JSonElem parseElem() throws JSonParseEx {
		if (cur=='{') {
			return parseObj();
		}
		else if (cur=='[') {
			return parseArray();
		}
		else if (cur=='"') {
			return parseString();
		}
		else if (Character.isDigit(cur) || cur=='-') {
			return parseNumber();
		}
		else if (cur==Json.Null.charAt(0)) {
			return parseConstant(Json.Null);
		}
		else if (cur==Json.True.charAt(0)) {
			return parseConstant(Json.True);
		}
		else if (cur==Json.False.charAt(0)) {
			return parseConstant(Json.False);
		}
		else {
			throw new RuntimeException(""+cur);
		}
		
	}
	
	private JSonElem parseInner() {
		try {
			skip();
			return parseElem();
		}
		catch (JSonParseEx e) {
				int id1=idx-50;
				int id2=idx+50;
				id1=Math.max(0, id1);
				id2=Math.min(s.length(), id2);
				
			throw new RuntimeException("idx="+idx+" cur="+cur+" "+s.substring(id1, id2),e);
		}
	}
	
	public static JSonElem parse(String source) {
		JSonParser jp=new JSonParser(source);
		return jp.parseInner();
	}

	public static class JSonParseEx extends Exception {

		private static final long serialVersionUID = 1L;

		public JSonParseEx() {
			super();
		}
	
		
		
	}
	
}
