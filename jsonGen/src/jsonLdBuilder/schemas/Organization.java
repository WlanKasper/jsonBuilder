package jsonLdBuilder.schemas;

import java.util.List;

import org.htjava.json.JSonArray;

public class Organization extends Thing {

	public Organization setGeo(GeoCoordinates geo) {
		set("geo", geo.get());
		return this;

	}

	public Organization setTelephone(String telephone) {

		set("telephone", telephone);
		return this;
	}

	public Organization setEmail(String email) {

		set("email", email);
		return this;
	}

	public Organization setAddress(Address address) {

		set("address", address.get());
		return this;
	}

	public Organization setLogo(String logo) {

		set("logo", logo);
		return this;
	}

	public Organization setFounder(Person founder) {

		set("founder", founder.get());
		return this;
	}

	public Organization setAggregateRating(AggregateRating aggregateRating) {

		set("aggregateRating", aggregateRating.get());
		return this;
	}

	public Organization setAreaServed(String areaServed) {

		set("areaServed", areaServed);
		return this;
	}

	public Organization setContactPoint(ContactPoint contactPoint) {

		set("contactPoint", contactPoint.get());
		return this;
	}

	public Organization setHasOfferCatalog(OfferCatalog hasOfferCatalog) {
		set("hasOfferCatalog", hasOfferCatalog.get());
		return this;
	}

	public Organization setHasPOS(Place hasPOS) {

		set("hasPOS", hasPOS);
		return this;
	}

	public Organization setLegalName(String legalName) {

		set("legalName", legalName);
		return this;
	}

	public Organization setLocation(Place location) {

		set("location", location.get());
		return this;
	}

	public Organization setReviews(List<Review> reviews) {

		JSonArray jArray = new JSonArray();
		for (Review review : reviews) {
			jArray.add(review.get());
		}
		set("review", jArray);
		return this;
	}

}
