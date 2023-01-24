package jsonLdBuilder.schemas;

import org.htjava.json.JSonObj;

public class Offer extends Thing {

	public Offer() {
		super();
		setType(Types.OFFER.getType());
	}

	public void setItemOffered(String type, String name) {
		set("itemOffered", new JSonObj().addObj("@type", type).addObj("name", name));
	}

}
