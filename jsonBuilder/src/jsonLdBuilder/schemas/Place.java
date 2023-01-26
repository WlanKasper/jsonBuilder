package jsonLdBuilder.schemas;

/**
 * Classe che rappresenta
 * <a href="https://schema.org/Place">schema.org/Place</a>
 * 
 * @author Matteo
 *
 */
public class Place extends Thing {

	public Place(GeoCoordinates geo) {
		super();
		setType(Types.PLACE.getType());
		setGeo(geo);
	}

	/**
	 * Imposta la proprieta "address"</br>
	 * es:</br>
	 * "address": {"@type": "PostalAddress"}
	 * 
	 * @param address {@link Address} o {@link String}
	 * @return {@link Place} per abilitare la sintessi concatenata
	 * 
	 */
	public Place setAddress(Address address) {
		set("address", address);
		return this;
	}

	/**
	 * Imposta la proprieta "address"</br>
	 * es:</br>
	 * "address": {"@type": "PostalAddress"}
	 * 
	 * @param address {@link Address} o {@link String}
	 * @return {@link Place} per abilitare la sintessi concatenata
	 * 
	 */
	public Place setAddress(String address) {
		set("address", address);
		return this;
	}

	/**
	 * Imposta la proprieta "aggregateRating"</br>
	 * es:</br>
	 * "aggregateRating": { "@type": "AggregateRating" ...}
	 * 
	 * @param aggregateRating {@link AggregateRating}
	 * @return {@link Place} per abilitare la sintessi concatenata
	 */
	public Place setAggregateRating(AggregateRating aggregateRating) {

		set("aggregateRating", aggregateRating);
		return this;
	}

	/**
	 * Imposta la proprieta "amenityFeature"</br>
	 * es:</br>
	 * 
	 * @param amenityFeature {@link AmenityFeature} contenente tutte le features
	 * @return {@link Place} per abilitare la sintessi concatenata
	 * 
	 */
	public Place setAmenityFeature(AmenityFeature amenityFeature) {
		set("amenityFeature", amenityFeature.setLocationFeatureSpecification());
		return this;
	}

	/**
	 * Imposta la proprieta "geo"</br>
	 * es:</br>
	 * "geo": { "@type": "GeoCoordinates", "latitude": "33.1", "longitude": "123.33"
	 * }
	 * 
	 * @param geo {@link GeoCoordinates}
	 * @return {@link Place} per abilitare la sintessi concatenata
	 * 
	 */
	public Place setGeo(GeoCoordinates geo) {

		set("geo", geo.get());
		return this;
	}

	/**
	 * Imposta la proprieta "latitude"</br>
	 * es:</br>
	 * "latitude": "33.1"
	 * 
	 * @param latitude
	 * @return {@link Place} per abilitare la sintessi concatenata
	 * 
	 */
	public Place setLatitude(double latitude) {

		set("latitude", latitude);
		return this;
	}

	/**
	 * Imposta la proprieta "longitude"</br>
	 * es:</br>
	 * "longitude": "123.33"
	 * 
	 * @param longitude
	 * @return {@link Place} per abilitare la sintessi concatenata
	 * 
	 */
	public Place setLongitude(double longitude) {

		set("longitude", longitude);
		return this;
	}

}
