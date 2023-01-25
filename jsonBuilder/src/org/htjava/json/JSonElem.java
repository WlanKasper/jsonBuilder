package org.htjava.json;

import org.htjava.json.Json.WriteMode;
import org.htjava.util.io.Writer;

public abstract class JSonElem {

	public JSonElem() {

	}
	
	public abstract int writeTo(Writer out);
	abstract int writeToInner(Writer out,int depth, WriteMode wm);

	abstract JSonElem myClone();
	
	public String toStringValue() {
		return toString();
	}
	
	public Integer toIntValue() {
		if (this==Json.Null) {
			return null;
		}
		else if (this instanceof JSonInteger) {
			return ((JSonInteger)this).value();
		}
		else {
			try {
				return Integer.parseInt(toStringValue());
			}
			catch (Exception e) {
				return null;
			}
		}
	}

	public Long toLongValue() {
		if (this==Json.Null) {
			return null;
		}
		else if (this instanceof JSonLong) {
			return ((JSonLong)this).value();
		}
		else if (this instanceof JSonInteger) {
			return (long)((JSonInteger)this).value();
		}
		else {
			try {
				return Long.parseLong(toStringValue());
			}
			catch (Exception e) {
				return null;
			}
		}
	}

	public Boolean toBoolValue() {
		if (this==Json.Null) {
			return null;
		}
		else if (this==Json.True) {
			return true;
		}
		else if (this==Json.False) {
			return false;
		}
		else if (this instanceof JSonInteger) {
			return ((JSonInteger)this).value()!=0;
		}
		else {
			throw new RuntimeException(""+toString());
		}
	}

	
}
