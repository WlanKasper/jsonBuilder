package jsonLdBuilder.schemas;

import java.util.List;

public class Place extends Thing {

	public Place(GeoCoordinates geo) {
		super();
		setType(Types.PLACE.getType());
		setGeo(geo);
	}

	public Place setAddress(String address) {

		set("address", address);
		return this;
	}

	public Place setAggregateRating(AggregateRating aggregateRating) {

		set("aggregateRating", aggregateRating);
		return this;
	}

	public Place setAmenityFeature(AmenityFeature amenityFeature) {

		set("amenityFeature", amenityFeature);
		return this;
	}

	public Place setGeo(GeoCoordinates geo) {

		set("geo", geo.get());
		return this;
	}

	public Place setLatitude(double latitude) {

		set("latitude", latitude);
		return this;
	}

	public Place setLongitude(double longitude) {

		set("longitude", longitude);
		return this;
	}

	public Place setPhotos(List<String> photos) {

		set("photo", photos);
		return this;
	}

}
