package org.htjava.json;

import org.htjava.json.Json.WriteMode;
import org.htjava.util.io.Writer;

public class JSonString extends JSonElem {

	private String value;
	public JSonString(String value) {
		this.value=value;
	}
	
	@Override
	public int writeTo(Writer out) {
		return writeToInner(out,-1,WriteMode.MIN); 
	}
	
	@Override
	int writeToInner(Writer out,int depth, WriteMode wm) {
		String res=Json.escape(value);
		out.write(res);
		return res.length();
	}

	@Override
	public String toString() {
		return value;
	}
	
	public String value() {
		return value;
	}

	@Override
	JSonElem myClone() {
		return this;
	}
	
	
}
