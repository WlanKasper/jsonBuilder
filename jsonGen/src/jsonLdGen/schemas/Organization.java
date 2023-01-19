package jsonLdGen.schemas;

public class Organization extends Thing {

//	public Organization(String name, String description, String url, String image) {
//		super(name, description, url, image);
//
//	}

	private String telephone;
	private String email;
	private Address address;
	private String logo;
	private Person founder;
	private AggregateRating aggregateRating;
	private String areaServed;
	private ContactPoint contactPoint;
	private OfferCatalog hasOfferCatalog;
	private Place hasPOS;
	private String legalName;
	private Place location;
	private Review review;

	public Organization(String name, String description, String url, String image, String telephone, String email,
			Address address, String logo, Person founder, AggregateRating aggregateRating, String areaServed,
			ContactPoint contactPoint, OfferCatalog hasOfferCatalog, Place hasPOS, String legalName, Place location,
			Review review) {
		super(name, description, url, image);
		this.telephone = telephone;
		this.email = email;
		this.address = address;
		this.logo = logo;
		this.founder = founder;
		this.aggregateRating = aggregateRating;
		this.areaServed = areaServed;
		this.contactPoint = contactPoint;
		this.hasOfferCatalog = hasOfferCatalog;
		this.hasPOS = hasPOS;
		this.legalName = legalName;
		this.location = location;
		this.review = review;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Person getFounder() {
		return founder;
	}

	public void setFounder(Person founder) {
		this.founder = founder;
	}

	public AggregateRating getAggregateRating() {
		return aggregateRating;
	}

	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

	public String getAreaServed() {
		return areaServed;
	}

	public void setAreaServed(String areaServed) {
		this.areaServed = areaServed;
	}

	public ContactPoint getContactPoint() {
		return contactPoint;
	}

	public void setContactPoint(ContactPoint contactPoint) {
		this.contactPoint = contactPoint;
	}

	public OfferCatalog getHasOfferCatalog() {
		return hasOfferCatalog;
	}

	public void setHasOfferCatalog(OfferCatalog hasOfferCatalog) {
		this.hasOfferCatalog = hasOfferCatalog;
	}

	public Place getHasPOS() {
		return hasPOS;
	}

	public void setHasPOS(Place hasPOS) {
		this.hasPOS = hasPOS;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public Place getLocation() {
		return location;
	}

	public void setLocation(Place location) {
		this.location = location;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}
	
	

}
