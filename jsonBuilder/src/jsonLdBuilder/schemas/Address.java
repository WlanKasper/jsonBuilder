package jsonLdBuilder.schemas;

/**
 * Classe che rappresenta
 * <a href="https://schema.org/PostalAddress">schema.org/PostalAddress</a>
 * 
 * @author Matteo
 *
 */
public class Address extends Thing {
	/**
	 * 
	 */
	public Address() {
		super();
		setType(Types.ADDRESS.getType());
	}

	/**
	 * 
	 * Imposta la proprieta "streetAddress"</br>
	 * es:</br>
	 * "streetAddress": "38 avenue de l'Opera"
	 * 
	 * @param streetAddress
	 * @return {@link Address} per abilitare la sintessi concatenata
	 */
	public Address setStreetAddress(String streetAddress) {
		set("streetAddress", streetAddress);
		return this;
	}

	/**
	 * 
	 * Imposta la proprieta "addressLocality"</br>
	 * es:</br>
	 * "addressLocality": "example" o "addressLocality": "Paris, France"
	 * 
	 * @param addressLocality
	 * @return {@link Address} per abilitare la sintessi concatenata
	 */
	public Address setAddressLocality(String addressLocality) {
		set("addressLocality", addressLocality);
		return this;
	}

	/**
	 * Imposta la proprieta "addressRegion"</br>
	 * es:</br>
	 * "addressRegion": "EX"
	 * 
	 * @param addressRegion
	 * @return {@link Address} per abilitare la sintessi concatenata
	 */
	public Address setAddressRegion(String addressRegion) {
		set("addressRegion", addressRegion);
		return this;
	}

	/**
	 * Imposta la proprieta "postalCode"</br>
	 * es:</br>
	 * "postalCode": "98052"
	 * 
	 * @param postalCode
	 * @return {@link Address} per abilitare la sintessi concatenata
	 */
	public Address setPostalCode(String postalCode) {

		set("postalCode", postalCode);
		return this;
	}

	/**
	 * Imposta la proprieta "addressCountry"</br>
	 * es:</br>
	 * "addressCountry": {"@type": "Country", "name": "IT"}}
	 * 
	 * 
	 * @param addressCountry {@link AddressCountry}
	 * @return {@link Address} per abilitare la sintessi concatenata
	 */
	public Address setAddressCountry(AddressCountry addressCountry) {
		set("addressCountry", addressCountry.get());
		return this;
	}
}
