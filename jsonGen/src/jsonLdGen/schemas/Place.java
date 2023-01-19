package jsonLdGen.schemas;

import java.util.List;

public class Place extends Thing {
	private String address;
	private AggregateRating aggregateRating;
	private AmenityFeature amenityFeature;
	private GeoCoordinates geo;
	private double latitude;
	private double longitude;
	private List<String> photos;
	
	public Place(String name, String description, String url, String image, String address,
			AggregateRating aggregateRating, AmenityFeature amenityFeature, GeoCoordinates geo, double latitude,
			double longitude, List<String> photos) {
		super(name, description, url, image);
		this.address = address;
		this.aggregateRating = aggregateRating;
		this.amenityFeature = amenityFeature;
		this.geo = geo;
		this.latitude = latitude;
		this.longitude = longitude;
		this.photos = photos;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public AggregateRating getAggregateRating() {
		return aggregateRating;
	}

	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

	public AmenityFeature getAmenityFeature() {
		return amenityFeature;
	}

	public void setAmenityFeature(AmenityFeature amenityFeature) {
		this.amenityFeature = amenityFeature;
	}

	public GeoCoordinates getGeo() {
		return geo;
	}

	public void setGeo(GeoCoordinates geo) {
		this.geo = geo;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public List<String> getPhotos() {
		return photos;
	}

	public void setPhotos(List<String> photos) {
		this.photos = photos;
	}
	
	

}
