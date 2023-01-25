package org.htjava.json;

import org.htjava.util.io.Writer;

public class Label {

	String name=null;
	
	public Label(String name) {
		this.name=name;
	}

	public int writeTo(Writer out) {
		out.write("\""+name+"\"");
		return name.length()+2;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return name==null ? 0 : name.hashCode();
	}

	/** serve ad evitare il warning chiamando equal con String
	 * 
	 * @param label la lavel in formato string
	 * @return true se la label corrisponde
	 */
	public boolean isEqual(String label) {
		return name.equals(label);
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Label ) {
			return name.equals(((Label)obj).getName());
		}
		else if (obj instanceof String) {
			return name.equals(obj);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Label [name=" + name + "]";
	}

	
	
}
