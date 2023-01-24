package jsonLdBuilder.schemas;

import org.htjava.json.JSonObj;

public class Address extends Thing {

	public Address() {
		super();
		setType(Types.ADDRESS.getType());
	}

	public Address setStreetAddress(String streetAddress) {
		set("streetAddress", streetAddress);
		return this;
	}

	public Address setAddressLocality(String addressLocality) {
		set("addressLocality", addressLocality);
		return this;
	}

	public Address setAddressRegion(String addressRegion) {
		set("addressRegion", addressRegion);
		return this;
	}

	public Address setPostalCode(String postalCode) {

		set("postalCode", postalCode);
		return this;
	}

	public Address setAddressCountry(String addressCountry) {

		set("addressCountry", addressCountry);
		return this;
	}

	public Address setAddressCountryCode(String addressCountryCode) {

		set("addressCountryCode", addressCountryCode);
		return this;
	}

	public Address setAddressCountryName(String addressCountryName) {

		set("addressCountryName", addressCountryName);
		return this;
	}

	public JSonObj getAddress() {
		return jObj;
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
