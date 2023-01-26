package jsonLdBuilder.schemas;

/**
 * Classe che rappresenta
 * <a href="https://schema.org/LocalBusiness">schema.org/LocalBusiness</a>
 * 
 * @author Matteo
 *
 */

public class LocalBusiness extends Organization {
	public LocalBusiness() {
		super();
//		setType(Types.LOCALBUSINESS.getType());
	}

	/**
	 * Imposta la proprieta "paymentAccepted"</br>
	 * es:</br>
	 * "paymentAccepted": "Cash, Credit Card"
	 * 
	 * @param paymentAccepted
	 * @return {@link LocalBusiness } per abilitare la sintessi concatenata
	 */
	public LocalBusiness setPaymentAccepted(String paymentAccepted) {
		jObj.addObj("paymentAccepted", paymentAccepted);
		return this;
	}

	/**
	 * Imposta la proprieta "priceRange"</br>
	 * es:</br>
	 * "priceRange": "$$$"
	 * 
	 * @param priceRange
	 * @return {@link LocalBusiness } per abilitare la sintessi concatenata
	 */
	public LocalBusiness setPriceRange(String priceRange) {
		jObj.addObj("priceRange", priceRange);
		return this;
	}

}
