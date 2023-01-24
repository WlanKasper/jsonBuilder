package jsonLdBuilder.schemas;


public class ContactPoint extends Thing {
	
	public ContactPoint(Place place) {
		super();
		setType(Types.CONTACTPOINT.getType());
		set("areaServed", place.get());  
	}
	
	public ContactPoint setTelephone(String telephone) {
		set("telephone", telephone);
		return this;
	}
	public ContactPoint setContactType(String contactType) {
		set("contactType", contactType);
		return this;
	}
	public ContactPoint setContactOption(String contactOption) {
		set("contactOption", contactOption);
		return this;
	}
	

}
