package jsonLdBuilder.schemas;

import org.htjava.json.JSonArray;

public class OfferCatalog extends ItemList {

	public OfferCatalog(String name) {
		super();
		setType(Types.OFFERCATALOG.getType());
		set("name", name);
	}

	public OfferCatalog addOfferCatalogList(String listName, ItemList offeredItems) {
		set("itemListElement", new JSonArray().add(offeredItems.get()));
		return this;
	}

}
