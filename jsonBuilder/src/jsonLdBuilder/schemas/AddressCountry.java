package jsonLdBuilder.schemas;

/**
 * Classe che rappresenta
 * <a href="https://schema.org/addressCountry">schema.org/addressCountry</a>
 * 
 * @author Matteo
 *
 */
public class AddressCountry extends Thing {
	/**
	 * L'oggetto ottenuteo sara delle forma:</br>
	 * {"@type": "Country", "name": "IT"
	 * 
	 * @param addressCountryName
	 */
	public AddressCountry(String addressCountryName) {
		super();
		setType(Types.COUNTRY.getType());
		setAddressCountryName(addressCountryName);
	}

	/**
	 * Imposta la proprieta "addressCountryName"</br>
	 * es:</br>
	 * "name": "IT"
	 * 
	 * @param addressCountryName
	 * @return
	 */
	protected AddressCountry setAddressCountryName(String addressCountryName) {
		setName(addressCountryName);
		return this;
	}
}
