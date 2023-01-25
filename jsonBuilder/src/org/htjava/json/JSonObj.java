package org.htjava.json;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.htjava.json.Json.WriteMode;
import org.htjava.util.io.Writer;

public class JSonObj extends JSonElem implements Iterable<NameValue> {

	List<NameValue> content=new ArrayList<>();
	
	public JSonObj() {
		// TODO Auto-generated constructor stub
	}
	
	protected JSonObj addInner(String name,JSonElem value) {
		content.add(new NameValue(new Label(name), value));
		return this;
	}

	public int size() {
		return content.size();
	}

	public JSonObj clear() {
		content.clear();
		return this;
	}

	public JSonObj add(NameValue nv) {
		content.add(nv);
		return this;
	}
	
	public JSonObj add(String name, JSonElem value) {
		return addInner(name, value);
	}
	
	public JSonObj add(String name, String value) {
		return addInner(name, new JSonString(value));
	}
	
	public JSonObj add(String name, Integer value) {
		return addInner(name, new JSonInteger(value));
	}
	
	public JSonObj add(String name, Double value) {
		return addInner(name, new JSonNumber(value));
	}

	public JSonObj add(String name, Long value) {
		return addInner(name, new JSonLong(value));
	}

	public JSonObj add(String name, Boolean value) {
		if (value==null)
			return addInner(name, Json.Null);
		return addInner(name, value ?  Json.True : Json.False );
	}

	public JSonObj addObj(String name, Object value) {
		return addInner(name, Json.fromObj(value));
	}
	
	public JSonObj setValue(String name, JSonElem value) {
		boolean changed=false;
		for (NameValue nv: content) {
			if (nv.getLabel().isEqual(name)) {
				nv.value=value;
				changed=true;
			}
		}
		if (!changed) {
			addInner(name, value);
		}
		
		return this;
	}

	public void remove(String name) {
		Iterator<NameValue> iter=content.iterator();
		while (iter.hasNext()) {
			if (iter.next().getLabel().isEqual(name))
				iter.remove();
		}
	}
	
	/** JSon prevede che un oggetto possa avere più valore con lo stesso name. Una volta parsato in Javascript viene preso l'ultimo.
	 *  Pertanto faccio la ricerca dall'ultimo.
	 *  potrebbe essere utile una funzione {@code List} di {@code JSonElem} getElems(String name) che li ritorni tutti.
	 * @param name {@code String}
	 * @return {@code JSonElem} {@code JSonElem}
	 */
	
	public JSonElem getElem(String name) {
		for (int i = content.size() - 1; i >= 0; i--) {
			if (content.get(i).getLabel().isEqual(name))
				return content.get(i).getValue();
		}
		return null;
	}
	
	
	 int writeToInner(Writer out,final int depth, WriteMode wm) {
			int len=0;
//			int dp=depth;
//			while (dp-->0) {
//				out.write("   ");
//				len+=3;
//			}
			out.write("{");
			boolean first=true;
			for (NameValue nv:content) {
				if (first) {
					first=false;
				} else {
					out.write(", ");
					len+=2;
				}
				len+=nv.writeToInner(out,depth+1,wm);
			}
			out.write("}");
			if (wm==WriteMode.HUMAN) {
				out.write("\n");
				len++;
			}
			return len+2; //2 per le {}
		} 
	
	
	@Override
	public int writeTo(Writer out) {
		return writeToInner(out, 0, WriteMode.MIN);
	}

	@Override
	public String toString() {
		return "JSonObj [content.size=" + content.size() + "]";
	}

	@Override
	JSonElem myClone() {
		JSonObj jsclone=new JSonObj();
		content.forEach(nv -> jsclone.add(new NameValue(nv.getLabel(), nv.getValue().myClone())));
		return jsclone;
	}

	public Iterator<NameValue> iterator() {
		return content.iterator();
	}
	
	
	
}
