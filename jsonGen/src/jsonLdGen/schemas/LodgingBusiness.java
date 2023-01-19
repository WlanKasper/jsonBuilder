package jsonLdGen.schemas;

import java.util.List;

import jsonGen.bean.SchemaInterface;

public class LodgingBusiness extends LocalBusiness {

	private List<String> amenityFeature;
	private int numberOfRooms;
	private boolean petsAllowed;
	private double starRating;

	public LodgingBusiness(String name, String description, String url, String image, String telephone, String email,
			Address address, String logo, Person founder, AggregateRating aggregateRating, String areaServed,
			ContactPoint contactPoint, OfferCatalog hasOfferCatalog, Place hasPOS, String legalName, Place location,
			Review review, List<String> paymentAccepted, String priceRange, List<String> amenityFeature,
			int numberOfRooms, boolean petsAllowed, double starRating) {
		super(name, description, url, image, telephone, email, address, logo, founder, aggregateRating, areaServed,
				contactPoint, hasOfferCatalog, hasPOS, legalName, location, review, paymentAccepted, priceRange);
		this.amenityFeature = amenityFeature;
		this.numberOfRooms = numberOfRooms;
		this.petsAllowed = petsAllowed;
		this.starRating = starRating;
	}

//	public LodgingBusiness(List<String> amenityFeature, int numberOfRooms, boolean petsAllowed, double starRating) {
//        this.amenityFeature = amenityFeature;
//        this.numberOfRooms = numberOfRooms;
//        this.petsAllowed = petsAllowed;
//        this.starRating = starRating;
//    }
//	    private String name;
//	    private String address;
//	    private String telephone;
//	    private String faxNumber;
//	    private String email;
//	    private String url;
//	    private AggregateRating aggregateRating;
//	    private Image image;
//	    private GeoCoordinates geo;
//
//	    public HotelSchema(String name, String address, String telephone, String faxNumber, String email, String url, AggregateRating aggregateRating, Image image, GeoCoordinates geo) {
//	        this.name = name;
//	        this.address = address;
//	        this.telephone = telephone;
//	        this.faxNumber = faxNumber;
//	        this.email = email;
//	        this.url = url;
//	        this.aggregateRating = aggregateRating;
//	        this.image = image;
//	        this.geo = geo;
//	    }
//
//	    public String getName() {
//	        return name;
//	    }
//
//	    public void setName(String name) {
//	        this.name = name;
//	    }
//

}
