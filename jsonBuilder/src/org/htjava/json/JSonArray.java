package org.htjava.json;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.htjava.json.Json.WriteMode;
import org.htjava.util.io.Writer;

public class JSonArray extends JSonElem implements Iterable<JSonElem> {

	List<JSonElem> lst=new ArrayList<>();
	
	public JSonArray() {
	}
	public JSonArray(Iterable<?> lst) {
		for (Object o:lst)
			addObj(o);
	}

	public int size() {
		return lst.size();
	}

	public boolean isEmpty() {
		return lst.isEmpty();
	}

	public JSonArray add(JSonElem e) {
		lst.add(e);
		return this;
	}

	public JSonArray add(String s) {
		return add(new JSonString(s));
	}

	public JSonArray add(Integer i) {
		return add(new JSonInteger(i));
	}

	public JSonArray addObj(Object value) {
		return add(Json.fromObj(value));
	}

	public JSonArray add(Boolean value) {
		if (value==null)
			return add(Json.Null);
		return add(value ?  Json.True : Json.False );
	}

	public JSonElem get(int idx) {
		return lst.get(idx);
	}
	
	
	
	@Override
	public int writeTo(Writer out) {
		return writeToInner(out, 0, WriteMode.MIN);
	}
	
	int writeToInner(Writer out,int depth, WriteMode wm) {
		int len=0;
		out.write("[");
		for (JSonElem el:lst) {
			if (len>0) {
				if (wm==WriteMode.HUMAN)
					out.write(",\n");
				else
					out.write(", ");
				len+=2;
			}
			len+=el.writeTo(out);
		}
		out.write("]");
		return len+2; //2 per le []
	}
	
	@Override
	public Iterator<JSonElem> iterator() {
		return lst.iterator();
	}
	@Override
	public String toString() {
		return "JSonArray [lst.size=" + lst.size() + "]";
	}
	
	@Override
	JSonElem myClone() {
		JSonArray jsclone=new JSonArray();
		lst.forEach(e -> jsclone.add(e.myClone()) );
		return jsclone;
	}
	
	

}
