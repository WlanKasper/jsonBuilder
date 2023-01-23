package jsonLdGen.schemas;

import java.util.List;

import org.htjava.json.JSonObj;

public class Place extends Thing {

//	private JSonObj jSonObj;
	private String address;
	private AggregateRating aggregateRating;
	private AmenityFeature amenityFeature;
	private GeoCoordinates geo;
	private double latitude;
	private double longitude;
	private List<String> photos;

	public Place(GeoCoordinates geo) {
		super();
		setType(Types.PLACE.getType());
		setGeo(geo);
	}

	public void setAddress(String address) {
		String str= Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t")+1,str.length());
		jObj.addObj(str, address);
	}

	public void setAggregateRating(AggregateRating aggregateRating) {
		String str= Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t")+1,str.length());
		jObj.addObj(str, aggregateRating);
	}

	public void setAmenityFeature(AmenityFeature amenityFeature) {
		String str= Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t")+1,str.length());
		jObj.addObj(str, amenityFeature);
	}

	public Place setGeo(GeoCoordinates geo) {
		String str= Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t")+1,str.length());
		jObj.addObj(str, geo.get());
		return this;
	}

	public void setLatitude(double latitude) {
		String str= Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t")+1,str.length());
		jObj.addObj(str, latitude);
	}

	public void setLongitude(double longitude) {
		String str= Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t")+1,str.length());
		jObj.addObj(str, longitude);
	}

	public void setPhotos(List<String> photos) {
		String str= Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t")+1,str.length());
		jObj.addObj(str, photos);
	}

}
