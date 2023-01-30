package jsonLdBuilder.schemas;

/**
 * Classe che rappresenta
 * <a href="https://schema.org/ContactPoint">schema.org/ContactPoint</a>
 * 
 * @author Matteo
 *
 */
public class ContactPoint extends Thing {
	/**
	 * 
	 * @param place {@link Place} l'area geografica dove e disponibile il servizo
	 */
	public ContactPoint(Place place) {
		super();
		setType(Types.CONTACTPOINT.getType());
		set("areaServed", place.get());
	}

	/**
	 * Imposta la proprieta "telephone"</br>
	 * es:</br>
	 * "telephone": "33391023"
	 * 
	 * @param telephone
	 * @return {@link ContactPoint} per abilitare la sintessi concatenata
	 */
	public ContactPoint setTelephone(String telephone) {
		set("telephone", telephone);
		return this;
	}

	/**
	 * Imposta la proprieta "contactType"</br>
	 * es:</br>
	 * "contactType":"sales contact point"
	 * 
	 * @param contactType {@link String} specifica il tipo di Contact Point
	 * @return {@link ContactPoint} per abilitare la sintessi concatenata
	 */
	public ContactPoint setContactType(String contactType) {
		set("contactType", contactType);
		return this;
	}

	/**
	 * Imposta la proprieta "contactOption"</br>
	 * es:</br>
	 * "contactOption" : "TollFree"
	 * 
	 * @param contactOption {@link String} che puo essere
	 *                      "HearingImpairedSupported", "TollFree" o "TollFree,
	 *                      HearingImpairedSupported"
	 * @return {@link ContactPoint} per abilitare la sintessi concatenata
	 */
	public ContactPoint setContactOption(String contactOption) {
		if (!contactOption.contains("TollFree") || !contactOption.contains("HearingImpairedSupported")) {
			throw new IllegalArgumentException("contactOption can be only 'HearingImpairedSupported' or 'TollFree' ");
			return;
		}

		set("contactOption", contactOption);
		return this;
	}

}
