package jsonLdBuilder.schemas;

import org.htjava.json.JSonArray;

/**
 * Classe che rappresenta
 * <a href="https://schema.org/OfferCatalog">schema.org/OfferCatalog</a>
 * 
 * @author Matteo
 *
 */

public class OfferCatalog extends ItemList {

	public OfferCatalog(String name) {
		super();
		setType(Types.OFFERCATALOG.getType());
		set("name", name);
	}

	/**
	 * Aggiunge un "itemListElement" array nel quale e contenuta una
	 * {@link ItemList} contenente {@link Offer} o altro
	 * 
	 * @param listName     nome della lista
	 * @param offeredItems {@link ItemList}
	 * @return {@link OfferCatalog} per abilitare la sintessi concatenata
	 */
	public OfferCatalog addOfferCatalogList(String listName, ItemList offeredItems) {
		set("itemListElement", new JSonArray().add(offeredItems.get()));
		return this;
	}

}
