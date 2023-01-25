package org.htjava.json;

import org.htjava.json.Json.WriteMode;
import org.htjava.util.io.Writer;
/** Questa classe deve essere mantenuta immutable o si deve cambiare myClone()
 * 
 * @author andrea
 *
 */
public class JSonConstant extends JSonElem {

	private String constant;
	private int len;
	
	JSonConstant(String constant) {
		this.constant=constant;
		this.len=constant.length();
	}
	
	@Override
	public int writeTo(Writer out) {
		out.write(constant);
		return len;
	}
	
	@Override
    int writeToInner(Writer out,int depth, WriteMode wm) {
		out.write(constant);
		return len;
	}

	@Override
	public String toString() {
		return constant;
	}
	
	char charAt(int i) {
		return constant.charAt(i);
	}
	
	int length() {
		return constant.length();
	}

	@Override
	JSonElem myClone() {
		return this;
	}
	
}
