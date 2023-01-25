package jsonLdBuilder.schemas;

import java.util.List;

public class LocalBusiness extends Organization {

	public LocalBusiness setPaymentAccepted(List<String> paymentAccepted) {
		jObj.addObj("paymentAccepted", paymentAccepted);
		return this;
	}

	public LocalBusiness setPriceRange(String priceRange) {
		jObj.addObj("priceRange", priceRange);
		return this;
	}

}
