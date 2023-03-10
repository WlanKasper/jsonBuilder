package org.htjava.util.io;

import java.util.HashMap;
import java.util.Map;


public class WriterHelper implements Writer {
	Writer out;

	public WriterHelper(Writer out) {
		this.out = out;
	}

	public void writeHtmlEscape(String s) {
		out.write(HTMLEscape(s));
	}
	
	public void write(String s) {
		out.write(s==null ? "null" : s);
	}
	
	public void writeln(String s) {
		out.write(s);
		writeln();
	}
	
	public void writeln() {
		out.write("\n");
	}

	public void write(char c) {
		out.write(String.valueOf(c));
	}
	public void write(int i) {
		out.write(String.valueOf(i));
	}
	
	public void write(long l) {
		out.write(String.valueOf(l));
	}
	
	public void write(Enum<?> e) {
		out.write(e.name());
	}

	
	
	public void print(String s) {
		write(s);
	}
	
	public void println(String s) {
		write(s);
		writeln();
	}
	
	public void println() {
		out.write("\n");
	}

	public void print(char c) {
		write(c);
	}
	
	public void print(Integer i) {
		out.write(i==null ? "null" : String.valueOf(i));
	}
	
	public void print(Long l) {
		out.write(l==null ? "null" : String.valueOf(l));
	}
	
	public void print(Enum<?> e) {
		out.write(e==null ? "null" : e.name());
	}


	
	
	private static String HTMLEscape(String s) {
		return HTMLEscape(s,false,false);
	}

	private static String HTMLEscape(String s,boolean nl,boolean full) {
		var map=full ? htmlEscFullMap : htmlEscMap;
		if (s==null) return "";
		StringBuffer res=new StringBuffer(s.length()*11/10+32);
		for (int i=0; i<s.length() ; i++ ) 		{
			char c=s.charAt(i);
			String escStr=map.get(c);
			if (escStr==null) {
				if(nl && c=='\n')
						res.append("<br />\n");
				else if(nl && c=='\r')
					;
				else if(full && Character.codePointAt(s.toCharArray(), i)>127)
					res.append("&#x"+Integer.toHexString(Character.codePointAt(s.toCharArray(), i))+";");
				else
					res.append(c);
			}
			else  {
				res.append('&');
				res.append(escStr);
				res.append(';');
			}
				
		}
		return res.toString();
	}//HTMLEscape

	private final static Map<String,Character> htmlUnescMap = new HashMap<>();
	private final static Map<Character,String> htmlEscMap = new HashMap<>();
	private final static Map<Character,String> htmlEscFullMap = new HashMap<>();
	
	static {
		htmlUnescMap.put("quot", '\"');
		htmlUnescMap.put("gt", '>');
		htmlUnescMap.put("lt", '<');
		htmlUnescMap.put("amp", '&');
		
		htmlUnescMap.forEach((k,v) -> htmlEscMap.put(v,k));

		htmlUnescMap.put("rsquo", '???');
		htmlUnescMap.put("euro", '???');
		htmlUnescMap.put("szlig", '??');
		htmlUnescMap.put("aelig", '??');
		htmlUnescMap.put("Agrave", '??');
		htmlUnescMap.put("Acirc", '??');
		htmlUnescMap.put("Auml", '??');
		htmlUnescMap.put("Egrave", '??');
		htmlUnescMap.put("Eacute", '??');
		htmlUnescMap.put("Ecirc", '??');
		htmlUnescMap.put("Igrave", '??');
		htmlUnescMap.put("Ograve", '??');
		htmlUnescMap.put("Ouml", '??');
		htmlUnescMap.put("Uuml", '??');
		htmlUnescMap.put("agrave", '??');
		htmlUnescMap.put("aacute", '??');
		htmlUnescMap.put("acirc", '??');
		htmlUnescMap.put("auml", '??');
		htmlUnescMap.put("egrave", '??');
		htmlUnescMap.put("eacute", '??');
		htmlUnescMap.put("ecirc", '??');
		htmlUnescMap.put("igrave", '??');
		htmlUnescMap.put("ograve", '??');
		htmlUnescMap.put("ouml", '??');
		htmlUnescMap.put("ugrave", '??');
		htmlUnescMap.put("uuml", '??');
		
		htmlUnescMap.forEach((k,v) -> htmlEscFullMap.put(v,k));

		htmlUnescMap.put("nbsp", ' ');
		
		htmlEscFullMap.put('\'',"rsquo");
		htmlEscFullMap.put('???',"quot");
		htmlEscFullMap.put('???',"quot");
	}
	

}
