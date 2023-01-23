package jsonLdGen.schemas;

import org.htjava.json.JSonObj;

public class ContactPoint extends Thing {
//	private String telephone;
//	private String contactType;
//	private String contactOption;
	
	public ContactPoint(Place place) {
		super();
		setType(Types.CONTACTPOINT.getType());
		jObj.addObj("areaServed", place.get());  
	}
	
	public ContactPoint setTelephone(String telephone) {
		jObj.addObj("telephone", telephone);
		return this;
	}
	public ContactPoint setContactType(String contactType) {
		jObj.addObj("contactType", contactType);
		return this;
	}
	public ContactPoint setContactOption(String contactOption) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, contactOption);
		return this;
	}
	

}
