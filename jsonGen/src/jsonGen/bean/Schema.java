package jsonGen.bean;

public class Schema {

	private static final String context = "http://www.schema.org";
	private static final String address = "address";
	private String type;
	private String name, streetAddress, addressCountry;

	public Schema(String type) {
		this.type = type;
	}

	public static String getContext() {
		return context;
	}

	public String gettype() {
		return type;
	}

	public void settype(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getAddress() {
		return address;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getAddressCountry() {
		return addressCountry;
	}

	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}

	public Object get(String key) {
		switch (key) {
			case "context":
				return getContext();
			case "type":
				return gettype();
			case "name":
				return getName();
			case "address":
				return getAddress();
			case "streetAddress":
				return getStreetAddress();
			case "addressCountry":
				return getAddressCountry();
			default:
				return null;
		}
	}

}
