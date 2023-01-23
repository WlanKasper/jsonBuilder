package jsonLdGen.schemas;

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
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, latitude);
		return this;
	}

	public GeoCoordinates setLongitude(double longitude) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, longitude);
		return this;
	}

}
