package org.htjava.json;

import org.htjava.util.io.Writer;
import org.htjava.util.io.WriterString;

/** Classe principale
 * 
 * @author andrea
 * 
 * 
 */
public class Json {

	public static enum WriteMode {MIN,HUMAN};
	
	private Json() {	}

	public static String escape(String s) {
		if (s==null)
			return "null";
		StringBuilder sb = new StringBuilder();
		sb.append("\"");
		char c,cprec=' ';
		for (int i=0;i<s.length();i++) {
			c=s.charAt(i);
			if (c=='"') {
				sb.append("\\\"");
			}
			else if (c=='\\') {
				sb.append("\\\\");
			}
			else if (c=='/' && cprec=='<') {
				sb.append("\\/");
			}
			else if (c=='\b') {
				sb.append("\\b");
			}
			else if (c=='\f') {
				sb.append("\\f");
			}
			else if (c=='\n') {
				sb.append("\\n");
			}
			else if (c=='\r') {
				sb.append("\\r");
			}
			else if (c=='\t') {
				sb.append("\\t");
			}
			else {
				sb.append(c);
			}
			cprec=c;
		}
		
		sb.append("\"");
		
		return sb.toString();
	}
	
	public static JSonElem createCloneFrom(JSonElem json) {
		return json.myClone();
	}
	
	public static int writeTo(JSonElem elem, Writer out,WriteMode wm) {
		return elem.writeToInner(out, 0, wm);
	}
	
	public static String writeToString(JSonElem json) {
		WriterString sw=new WriterString();
		json.writeTo(sw);
		return sw.out();
	}

	public static String writeToString(JSonElem json,WriteMode wm) {
		WriterString sw=new WriterString();
		json.writeToInner(sw, 0, wm);
		return sw.out();
	}

	public static final JSonElem fromObj(Object value) {
		if (value==null)
			return Null;
		if (value instanceof JSonElem)
			return (JSonElem)value;
		if (value instanceof ToJson)
			return ((ToJson)value).json();
		if (value instanceof String)
			return new JSonString((String)value);
		if (value instanceof Integer) 
			return new JSonInteger((Integer)value);
		if (value instanceof Boolean) 
			return ((Boolean)value) ? True : False;
		if (value instanceof Enum<?>) 
			return new JSonString(((Enum<?>)value).name());
		if (value instanceof Iterable<?>) 
			return new JSonArray((Iterable<?>)value);
// TODO Array ????		
//		if (value.getClass().isArray()) 
//			return new JSonArray(Arrays.asList((Array)value));
		
		
		return new JSonString(value.toString());
	}
	
	public static final JSonConstant Null=new JSonConstant("null");
	public static final JSonConstant True=new JSonConstant("true");
	public static final JSonConstant False=new JSonConstant("false");
	
}
