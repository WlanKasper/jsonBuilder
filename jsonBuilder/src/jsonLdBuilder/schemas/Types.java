package jsonLdBuilder.schemas;

/**
 * Enum che contiene tutti i vari type delle classi implementate
 * 
 * @author Matteo
 *
 */
public enum Types {
	THING("Thing"), HOTEL("Hotel"), ADDRESS("PostalAddress"), REVIEW("Review"), AGGREGATERATING("AggregateRating"),
	RATING("Rating"), CONTACTPOINT("ContactPoint"), PLACE("Place"), GEOCOORDINATES("GeoCoordinates"), PERSON("Person"),
	ITEMLIST("Offer"), OFFERCATALOG("OfferCatalog"), OFFER("Offer"), COUNTRY("Country"),
	AMENITYFEATURE("LocationFeatureSpecification"),LOCALBUSINESS("LocalBusiness");

	private String type;

	private Types(String type) {
		this.type = type;
	}

	/**
	 * Metodo che ritorna la stringa per la proprieta "@type" del type riferito
	 * 
	 * @return String type
	 */
	public String getType() {
		return type;
	}

}
