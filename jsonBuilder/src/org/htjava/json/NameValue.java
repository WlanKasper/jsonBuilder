package org.htjava.json;

import org.htjava.json.Json.WriteMode;
import org.htjava.util.io.Writer;

public class NameValue {

	Label label;
	JSonElem value;
	
	NameValue() {
	}
	
	public NameValue(Label label, JSonElem value) {
		this.label = label;
		this.value = value;
	}
	
	public int writeTo(Writer out) {
		return writeToInner(out, -1, WriteMode.MIN);
	}

	
	public Label getLabel() {
		return label;
	}

	public JSonElem getValue() {
		return value;
	}

	int writeToInner(Writer out,int depth, WriteMode wm) {
		int len=0;
		if (wm==WriteMode.HUMAN) {
			out.write("\n");
			len++;
		}
		
		len+=label.writeTo(out);
		out.write(": ");
		len+=value.writeToInner(out,-1,wm);

		return 2+len;
	}

	@Override
	public String toString() {
		return "NameValue [label=" + label + ", value=" + value + "]";
	}
	
	

}
