package jsonLdGen.schemas;

import java.util.List;

public class LocalBusiness extends Organization {
	private List<String> paymentAccepted;
	private String priceRange;

	public LocalBusiness(String name, String description, String url, String image, String telephone, String email,
			Address address, String logo, Person founder, AggregateRating aggregateRating, String areaServed,
			ContactPoint contactPoint, OfferCatalog hasOfferCatalog, Place hasPOS, String legalName, Place location,
			Review review, List<String> paymentAccepted, String priceRange) {
		super(name, description, url, image, telephone, email, address, logo, founder, aggregateRating, areaServed,
				contactPoint, hasOfferCatalog, hasPOS, legalName, location, review);
		this.paymentAccepted = paymentAccepted;
		this.priceRange = priceRange;
	}

	public List<String> getPaymentAccepted() {
		return paymentAccepted;
	}

	public void setPaymentAccepted(List<String> paymentAccepted) {
		this.paymentAccepted = paymentAccepted;
	}

	public String getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

}
