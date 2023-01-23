package jsonLdGen.schemas;

import org.htjava.json.JSonObj;

public class Address extends Thing {

//	private JSonObj jObj;
//	private String streetAddress;
//	private String addressLocality;
//	private String addressRegion;
//	private String postalCode;
//	private String addressCountry;
//	private String addressCountryCode;
//	private String addressCountryName;

//	public Address(String streetAddress, String addressLocality, String addressRegion, String postalCode,
//			String addressCountry, String addressCountryCode, String addressCountryName) {
//		super();
//		this.streetAddress = streetAddress;
//		this.addressLocality = addressLocality;
//		this.addressRegion = addressRegion;
//		this.postalCode = postalCode;
//		this.addressCountry = addressCountry;
//		this.addressCountryCode = addressCountryCode;
//		this.addressCountryName = addressCountryName;
//		setType(Types.ADDRESS.getType());
//	}

	public Address() {
		super();
		setType(Types.ADDRESS.getType());
//		jObj = new JSonObj();
	}

	public Address setStreetAddress(String streetAddress) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, streetAddress);
		return this;
	}

	public Address setAddressLocality(String addressLocality) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, addressLocality);
		return this;
	}

	public Address setAddressRegion(String addressRegion) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, addressRegion);
		return this;
	}

	public Address setPostalCode(String postalCode) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, postalCode);
		return this;
	}

	public Address setAddressCountry(String addressCountry) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, addressCountry);
		return this;
	}

	public Address setAddressCountryCode(String addressCountryCode) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, addressCountryCode);
		return this;
	}

	public Address setAddressCountryName(String addressCountryName) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, addressCountryName);
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
