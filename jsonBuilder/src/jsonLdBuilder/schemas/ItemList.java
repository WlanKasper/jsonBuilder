package jsonLdBuilder.schemas;

import java.util.HashMap;
import java.util.Map;

import org.htjava.json.JSonArray;
import org.htjava.json.JSonObj;

/**
 * Classe che rappresenta
 * <a href="https://schema.org/ItemList">schema.org/ItemList</a>
 * 
 * @author Matteo
 *
 */
public class ItemList extends Thing {

	public ItemList() {
		super();
	}

	/**
	 * Imposta un "itemListElement" array per contenere proprieta con "@type"
	 * Service, {@link Offer}, ecc...</br>
	 * es:</br>
	 * "itemListElement": ["@type: Offer", {"@type": "Offer", "name": "Extreme
	 * one"}]
	 * 
	 * @param items {@link HashMap} dove key = "@type" e value = "name"
	 */
	public void setItemListElement(HashMap<String, String> items) {
		JSonArray jArray = new JSonArray();
		JSonObj obj = new JSonObj();
//		obj.addObj("@type", Types.OFFER.getType());
		jArray.add("@type: " + Types.OFFER.getType());
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
