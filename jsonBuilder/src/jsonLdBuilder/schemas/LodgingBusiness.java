package jsonLdBuilder.schemas;

import java.util.List;

public class LodgingBusiness extends LocalBusiness {

	public LodgingBusiness setAmenityFeature(List<String> amenityFeature) {
		set("amenityFeature", amenityFeature);
		return this;
	}

	public LodgingBusiness setNumberOfRooms(int numberOfRooms) {

		set("numberOfRooms", numberOfRooms);
		return this;
	}

	public LodgingBusiness setPetsAllowed(boolean petsAllowed) {

		set("petsAllowed", petsAllowed);
		return this;
	}

	public LodgingBusiness setStarRating(double starRating) {

		set("starRating", starRating);
		return this;
	}

}