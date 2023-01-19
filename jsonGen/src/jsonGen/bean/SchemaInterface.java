package jsonGen.bean;

public interface SchemaInterface {

	static final String context = "http://www.schema.org";
	static final String address = "address";

	static final String aggregateRating = "aggregateRating";
	static final String starRating = "starRating";
	static final String areaServed = "areaServed";
	static final String founder = "founder";
	static final String hotel = type.Hotel.toString();

	enum type {
		Hotel, PostalAddress, AggregateRating, ContactPoint, Place, GeoCoordinates, Person, OfferCatalog, Offer, Review,
		Rating, ImageObject
	};

	public static final String name = "";
	public static final String streetAddress = "";
	public static final String addressCountry = "";
	public static final String paymentAccepted = "";
	public static final String priceRange = "";
	public static final String addressLocality = "";
	public static final String addressRegoin = "";
	public static final String contactType = "";
	public static final String contactOption = "";
	public static final String email = "";
	public static final Integer numberOfRooms = null;
	public static final Integer postalCode = null;
	public static final Integer ratingValue = null;
	public static final Integer reviewCount = null;
	public static final Integer bestRating = null;
	public static final Integer worstRating = null;
	public static final Integer latitude = null;
	public static final Integer longitude = null;
	public static final Boolean petsAllowed = null;

}
