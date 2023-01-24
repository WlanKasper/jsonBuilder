package jsonLdBuilder.schemas;

public class GeoCoordinates extends Thing {
//	Long latitude;
//	Long longitude;

	public GeoCoordinates(double latitude, double longitude) {
		super();
		setType(Types.GEOCOORDINATES.getType());
		setLatitude(latitude);
		setLongitude(longitude);
	}

	public GeoCoordinates setLatitude(double latitude) {
		set("latitude", latitude);
		return this;
	}

	public GeoCoordinates setLongitude(double longitude) {
		
		set("longitude", longitude);
		return this;
	}

}
