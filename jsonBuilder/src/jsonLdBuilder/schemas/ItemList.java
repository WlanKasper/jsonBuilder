package jsonLdBuilder.schemas;

import java.util.HashMap;
import java.util.Map;

import org.htjava.json.JSonArray;
import org.htjava.json.JSonObj;

public class ItemList extends Thing {

	public ItemList() {
		super();
	}

	public void setItemListElement(HashMap<String, String> items) {
		JSonArray jArray = new JSonArray();
		JSonObj obj = new JSonObj();
//		obj.addObj("@type", Types.OFFER.getType());
		jArray.add("@type: "+Types.OFFER.getType());
//		jArray.add()
		for (Map.Entry<String, String> entry : items.entrySet()) {
			obj = new JSonObj();
			obj.addObj("@type", entry.getKey());
			obj.addObj("name", entry.getValue());
			jArray.addObj(obj);
		}
		setType(Types.OFFERCATALOG.getType());
		set("itemListElement", jArray);

	}

}
