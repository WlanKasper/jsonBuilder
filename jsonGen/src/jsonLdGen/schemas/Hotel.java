package jsonLdGen.schemas;

import java.util.List;

public class Hotel extends LodgingBusiness {

	private Place place;

	public Hotel(String name, String description, String url, String image, String telephone, String email,
			Address address, String logo, Person founder, AggregateRating aggregateRating, String areaServed,
			ContactPoint contactPoint, OfferCatalog hasOfferCatalog, Place hasPOS, String legalName, Place location,
			Review review, List<String> paymentAccepted, String priceRange, List<String> amenityFeature,
			int numberOfRooms, boolean petsAllowed, double starRating, Place place) {
		super(name, description, url, image, telephone, email, address, logo, founder, aggregateRating, areaServed,
				contactPoint, hasOfferCatalog, hasPOS, legalName, location, review, paymentAccepted, priceRange,
				amenityFeature, numberOfRooms, petsAllowed, starRating);
		this.place = place;
		setType("Hotel");
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public Object get(String key) {
		switch (key) {
		case "name":
			return getName();
		case "address":
			return getAddress();
		default:
			break;
		}
		return null;
	}

}
