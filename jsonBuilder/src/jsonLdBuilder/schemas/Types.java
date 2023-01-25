package jsonLdBuilder.schemas;

public enum Types {
	THING("Thing"), HOTEL("Hotel"), ADDRESS("PostalAddress"), REVIEW("Review"), AGGREGATERATING("AggregateRating"),
	RATING("Rating"), CONTACTPOINT("ContactPoint"), PLACE("Place"), GEOCOORDINATES("GeoCoordinates"), PERSON("Person"),
	ITEMLIST("Offer"), OFFERCATALOG("OfferCatalog"), OFFER("Offer"), COUNTRY("Country");

	private String type;

	private Types(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
