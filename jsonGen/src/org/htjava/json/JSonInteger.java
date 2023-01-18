package org.htjava.json;

import org.htjava.json.Json.WriteMode;
import org.htjava.util.io.Writer;

public class JSonInteger extends JSonElem {

	private Integer value;
	public JSonInteger(Integer value) {
		this.value=value;
	}

	@Override

	public int writeTo(Writer out) {
		return writeToInner(out,-1, WriteMode.MIN); 
	}	
	
	int writeToInner(Writer out,int depth, WriteMode wm) {
		String res=value==null ? "null" : value.toString();
		out.write(res);
		return res.length();
	}

	@Override
	public String toString() {
		return value==null ? "nullint" : value.toString() ;
	}
	
	public Integer value() {
		return value;
	}

	@Override
	JSonElem myClone() {
		return this;
	}
	
}
