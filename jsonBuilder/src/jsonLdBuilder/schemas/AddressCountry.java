package jsonLdBuilder.schemas;

public class AddressCountry extends Thing {

	public AddressCountry() {
		super();
		setType(Types.COUNTRY.getType());
	}

	public AddressCountry setAddressCountryName(String addressCountryName) {
		set("name", addressCountryName);
		return this;
	}
}
