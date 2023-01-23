package jsonLdGen.schemas;

public enum Types {
	THING("Thing"), HOTEL("Hotel"), ADDRESS("PostalAddress"), REVIEW("Review"), AGGREGATERATING("AggregateRating"),
	RATING("Rating"),CONTACTPOINT("ContactPoint"),PLACE("Place"), GEOCOORDINATES("GeoCoordinates");

	private String type;

	private Types(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
