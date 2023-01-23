package jsonLdGen.schemas;

import java.util.List;

public class LocalBusiness extends Organization {
	private List<String> paymentAccepted;
	private String priceRange;
	public void setPaymentAccepted(List<String> paymentAccepted) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, paymentAccepted);
	}
	public void setPriceRange(String priceRange) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, priceRange);
	}

	
}
