package jsonLdBuilder.schemas;

import java.util.List;

import org.htjava.json.JSonArray;

/**
 * Classe che rappresenta
 * <a href="https://schema.org/Organization">schema.org/Organization</a>
 * 
 * @author Matteo
 *
 */
public class Organization extends Thing {

	public Organization() {
		super();
	}

	/**
	 * Imposta la proprieta "geo"</br>
	 * es:</br>
	 * "geo": { "@type": "GeoCoordinates", "latitude": "33.1", "longitude": "123.33"
	 * }
	 * 
	 * @param geo {@link GeoCoordinates}
	 * @return {@link Organization} per abilitare la sintessi concatenata
	 */
	public Organization setGeo(GeoCoordinates geo) {
		set("geo", geo.get());
		return this;

	}

	/**
	 * Imposta la proprieta "telephone"</br>
	 * es:</br>
	 * "telephone": "33333333"
	 * 
	 * 
	 * @param telephone
	 * @return {@link Organization} per abilitare la sintessi concatenata
	 */
	public Organization setTelephone(String telephone) {

		set("telephone", telephone);
		return this;
	}

	/**
	 * Imposta la proprieta "email"</br>
	 * es:</br>
	 * "email": "example@example.it"
	 * 
	 * 
	 * @param email
	 * @return {@link Organization} per abilitare la sintessi concatenata
	 */
	public Organization setEmail(String email) {

		set("email", email);
		return this;
	}

	/**
	 * Imposta la proprieta "address"</br>
	 * es:</br>
	 * "address": { "@type": "PostalAddress" ...}
	 * 
	 * @param address {@link Address}
	 * @return {@link Organization} per abilitare la sintessi concatenata
	 */
	public Organization setAddress(Address address) {

		set("address", address.get());
		return this;
	}

	/**
	 * Imposta la proprieta "logo"</br>
	 * es:</br>
	 * "logo": "url",
	 * 
	 * 
	 * @param logo URL per il logo
	 * @return {@link Organization} per abilitare la sintessi concatenata
	 */
	public Organization setLogo(String logo) {

		set("logo", logo);
		return this;
	}

	/**
	 * Imposta la proprieta "founder"</br>
	 * es:</br>
	 * "founder": { "@type": "Person", "name": "name" }
	 * 
	 * @param founder {@link Person}
	 * @return {@link Organization} per abilitare la sintessi concatenata
	 */
	public Organization setFounder(Person founder) {

		set("founder", founder.get());
		return this;
	}

	/**
	 * Imposta la proprieta "aggregateRating"</br>
	 * es:</br>
	 * "aggregateRating": { "@type": "AggregateRating" ...}
	 * 
	 * @param aggregateRating {@link AggregateRating}
	 * @return {@link Organization} per abilitare la sintessi concatenata
	 */
	public Organization setAggregateRating(AggregateRating aggregateRating) {

		set("aggregateRating", aggregateRating.get());
		return this;
	}

	/**
	 * Imposta la proprieta "areaServed"</br>
	 * es:</br>
	 * "areaServed": "IT",
	 * 
	 * 
	 * @param areaServed
	 * @return {@link Organization} per abilitare la sintessi concatenata
	 */
	public Organization setAreaServed(String areaServed) {

		set("areaServed", areaServed);
		return this;
	}

	/**
	 * Imposta la proprieta "contactPoint"</br>
	 * es:</br>
	 * "contactPoint": { "@type": "ContactPoint" ...}
	 * 
	 * @param contactPoint {@link ContactPoint}
	 * @return {@link Organization} per abilitare la sintessi concatenata
	 */
	public Organization setContactPoint(ContactPoint contactPoint) {

		set("contactPoint", contactPoint.get());
		return this;
	}

	/**
	 * Imposta la proprieta "hasOfferCatalog"</br>
	 * es:</br>
	 * "hasOfferCatalog": { "@type": "OfferCatalog", "name": "example" },
	 * 
	 * @param hasOfferCatalog {@link OfferCatalog}
	 * @return {@link Organization} per abilitare la sintessi concatenata
	 */
	public Organization setHasOfferCatalog(OfferCatalog hasOfferCatalog) {
		set("hasOfferCatalog", hasOfferCatalog.get());
		return this;
	}

	/**
	 * Imposta la proprieta "hasPOS"</br>
	 * es:</br>
	 * "hasPOS": { "@type": "Place",...}
	 * 
	 * @param hasPOS {@link Place}
	 * @return {@link Organization} per abilitare la sintessi concatenata
	 */
	public Organization setHasPOS(Place hasPOS) {

		set("hasPOS", hasPOS.get());
		return this;
	}

	/**
	 * Imposta la proprieta "legalName"</br>
	 * 
	 * es:</br>
	 * "legalName":"example"
	 * 
	 * @param legalName
	 * @return {@link Organization} per abilitare la sintessi concatenata
	 */
	public Organization setLegalName(String legalName) {

		set("legalName", legalName);
		return this;
	}

	/**
	 * Imposta la proprieta "location"</br>
	 * es:</br>
	 * "location": { "@type": "Place"}
	 * 
	 * @param location {@link Place}
	 * @return {@link Organization} per abilitare la sintessi concatenata
	 */
	public Organization setLocation(Place location) {

		set("location", location.get());
		return this;
	}

	/**
	 * Imposta l'array di proprieta "review"</br>
	 * es:</br>
	 * "review": [ { "@type": "Review", ...}, { "@type": "Review", ...} ]
	 * 
	 * @param reviews {@link Review} list
	 * @return {@link Organization} per abilitare la sintessi concatenata
	 */
	public Organization setReviews(List<Review> reviews) {

		JSonArray jArray = new JSonArray();
		for (Review review : reviews) {
			jArray.add(review.get());
		}
		set("review", jArray);
		return this;
	}

}
