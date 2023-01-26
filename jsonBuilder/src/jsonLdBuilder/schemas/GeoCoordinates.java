package jsonLdBuilder.schemas;

/**
 * Classe che rappresenta
 * <a href="https://schema.org/GeoCoordinates">schema.org/GeoCoordinates</a>
 * 
 * @author Matteo
 *
 */
public class GeoCoordinates extends Thing {

	public GeoCoordinates(double latitude, double longitude) {
		super();
		setType(Types.GEOCOORDINATES.getType());
		setLatitude(latitude);
		setLongitude(longitude);
	}

	/**
	 * Imposta la proprieta "latitude"</br>es:</br>
	 * "latitude": "33.1"
	 * 
	 * @param latitude
	 * @return {@link Place} per abilitare la sintessi concatenata
	 * 
	 */
	public GeoCoordinates setLatitude(double latitude) {
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
	public GeoCoordinates setLongitude(double longitude) {

		set("longitude", longitude);
		return this;
	}

}
