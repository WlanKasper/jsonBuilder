package jsonLdGen.schemas;

public class Address {

	private String streetAddress;
	private String addressLocality;
	private String addressRegion;
	private String postalCode;
	private String addressCountry;
	private String addressCountryCode;
	private String addressCountryName;



	public Address(String streetAddress, String addressLocality, String addressRegion, String postalCode,
			String addressCountry, String addressCountryCode, String addressCountryName) {
		super();
		this.streetAddress = streetAddress;
		this.addressLocality = addressLocality;
		this.addressRegion = addressRegion;
		this.postalCode = postalCode;
		this.addressCountry = addressCountry;
		this.addressCountryCode = addressCountryCode;
		this.addressCountryName = addressCountryName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getAddressLocality() {
		return addressLocality;
	}

	public void setAddressLocality(String addressLocality) {
		this.addressLocality = addressLocality;
	}

	public String getAddressRegion() {
		return addressRegion;
	}

	public void setAddressRegion(String addressRegion) {
		this.addressRegion = addressRegion;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getAddressCountry() {
		return addressCountry;
	}

	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}

	public String getAddressCountryCode() {
		return addressCountryCode;
	}

	public void setAddressCountryCode(String addressCountryCode) {
		this.addressCountryCode = addressCountryCode;
	}

	public String getAddressCountryName() {
		return addressCountryName;
	}

	public void setAddressCountryName(String addressCountryName) {
		this.addressCountryName = addressCountryName;
	}

//	public Address(String streetAddress, String addressLocality, String addressRegion, String postalCode,
//			String addressCountry, String addressCountryCode, String addressCountryName) {
//		this.streetAddress = streetAddress;
//		this.addressLocality = addressLocality;
//		this.addressRegion = addressRegion;
//		this.postalCode = postalCode;
//		this.addressCountry = addressCountry;
//		this.addressCountryCode = addressCountryCode;
//		this.addressCountryName = addressCountryName;
//	}

}
