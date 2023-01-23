package jsonLdGen.schemas;

import java.util.List;

import org.htjava.json.JSonArray;
import org.htjava.json.JSonObj;

public class Organization extends Thing {

	private String telephone;
	private String email;
	private Address address;
	private String logo;
	private Person founder;
	private AggregateRating aggregateRating;
	private String areaServed;
	private ContactPoint contactPoint;
	private OfferCatalog hasOfferCatalog;
	private Place hasPOS;
	private String legalName;
	private Place location;
	private Review review;

	public void setTelephone(String telephone) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, telephone);
	}

	public void setEmail(String email) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, email);
	}

	public void setAddress(Address address) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, address.get());
	}

	public void setLogo(String logo) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, logo);
	}

	public void setFounder(Person founder) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, founder);
	}

	public void setAggregateRating(AggregateRating aggregateRating) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, aggregateRating.get());
	}

	public void setAreaServed(String areaServed) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, areaServed);
	}

	public void setContactPoint(ContactPoint contactPoint) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, contactPoint.get());
	}

	public void setHasOfferCatalog(OfferCatalog hasOfferCatalog) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, hasOfferCatalog);
	}

	public void setHasPOS(Place hasPOS) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, hasPOS);
	}

	public void setLegalName(String legalName) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, legalName);
	}

	public void setLocation(Place location) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, location.get());
	}

	public void setReviews(List<Review> reviews) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		JSonArray jArray= new JSonArray();
		for (Review review : reviews) {
			jArray.add(review.get());	
		}
		jObj.addObj(str, jArray);
	}

}
