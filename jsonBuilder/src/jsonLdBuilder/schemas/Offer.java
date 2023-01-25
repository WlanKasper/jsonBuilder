package jsonLdBuilder.schemas;

import java.time.LocalDate;

import org.htjava.json.JSonObj;

public class Offer extends Thing {

	public Offer() {
		super();
		setType(Types.OFFER.getType());
	}

	public Offer setItemOffered(String type, String name) {
		set("itemOffered", new JSonObj().addObj("@type", type).addObj("name", name));
		return this;
	}

	public Offer setDescription(String description) {
		set("description", description);
		return this;
	}

	public Offer setPrice(double price) {
		set("price", price);
		return this;
	}

	public Offer setPriceCurrency(String priceCurrency) {
		set("priceCurrency", priceCurrency);
		return this;
	}

	public Offer setItemCondition(String itemCondition) {
		set("itemCondition", itemCondition);
		return this;
	}

	public Offer setAvailabilityStarts(LocalDate availabilityStarts) {
		set("availabilityStarts", availabilityStarts.toString());
		return this;
	}

	public Offer setAvailabilityEnds(LocalDate availabilityEnds) {
		set("availabilityEnds", availabilityEnds.toString());
		return this;
	}

	public Offer setOfferedBy(Object offeredby) {
		switch (offeredby.getClass().getSimpleName()) {
		case "Hotel":
			Hotel hotel = (Hotel) offeredby;
			set("OfferedBy", hotel.get());
			break;
		case "LodgingBusiness":
			LodgingBusiness lodgingBusiness = (LodgingBusiness) offeredby;
			set("OfferedBy", lodgingBusiness.get());
			break;
		case "LocalBusiness":
			LocalBusiness localBusiness = (LocalBusiness) offeredby;
			set("OfferedBy", localBusiness.get());
			break;
		case "Person":
			Person person = (Person) offeredby;
			set("OfferedBy", person.get());
			break;

		default:
			break;
		}

		return this;
	}
}
