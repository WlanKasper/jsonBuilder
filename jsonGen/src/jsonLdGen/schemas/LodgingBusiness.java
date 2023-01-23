package jsonLdGen.schemas;

import java.util.List;

import jsonGen.bean.SchemaInterface;

public class LodgingBusiness extends LocalBusiness {

	private List<String> amenityFeature;
	private int numberOfRooms;
	private boolean petsAllowed;
	private double starRating;

	public void setAmenityFeature(List<String> amenityFeature) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, amenityFeature);
	}

	public void setNumberOfRooms(int numberOfRooms) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, numberOfRooms);
	}

	public void setPetsAllowed(boolean petsAllowed) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, petsAllowed);
	}

	public void setStarRating(double starRating) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, starRating);
	}

}