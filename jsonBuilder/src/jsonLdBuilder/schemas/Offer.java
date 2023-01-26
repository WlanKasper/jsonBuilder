package jsonLdBuilder.schemas;

import java.time.LocalDate;

import org.htjava.json.JSonObj;

/**
 * Classe che rappresenta
 * <a href="https://schema.org/Offer">schema.org/Offer</a>
 * 
 * @author Matteo
 *
 */
public class Offer extends Thing {

	public Offer() {
		super();
		setType(Types.OFFER.getType());
	}

	/**
	 * Imposta la proprieta "itemOffered"</br>
	 * es:</br>
	 * "itemOffered":"Service"
	 * 
	 * @param type {@link String} riferisce il tipo di offerta(Product, Service,...)
	 * @param name {@link String} nome del prodotto
	 * @return {@link Offer} per abilitare la sintessi concatenata
	 */
	public Offer setItemOffered(String type, String name) {
		set("itemOffered", new JSonObj().addObj("@type", type).addObj("name", name));
		return this;
	}

	/**
	 * Imposta la proprieta "description"</br>
	 * es:</br>
	 * "description": "La nostra casa vi offre un ..."
	 * 
	 * @param description
	 * @return {@link Offer} per abilitare la sintessi concatenata
	 */
	public Offer setDescription(String description) {
		set("description", description);
		return this;
	}

	/**
	 * Imposta la proprieta "price"</br>
	 * es:</br>
	 * "price": "70.0"
	 * 
	 * @param price
	 * @return {@link Offer} per abilitare la sintessi concatenata
	 */
	public Offer setPrice(double price) {
		set("price", price);
		return this;
	}

	/**
	 * Imposta la proprieta "priceCurrency"</br>
	 * es:</br>
	 * "priceCurrency": "EUR"
	 * 
	 * @param priceCurrency
	 * @return {@link Offer} per abilitare la sintessi concatenata
	 */
	public Offer setPriceCurrency(String priceCurrency) {
		set("priceCurrency", priceCurrency);
		return this;
	}

	/**
	 * Imposta la proprieta "itemCondition"</br>
	 * es:</br>
	 * "itemCondition": "a notte, a persona, prima colazione"
	 * 
	 * @param itemCondition
	 * @return {@link Offer} per abilitare la sintessi concatenata
	 */
	public Offer setItemCondition(String itemCondition) {
		set("itemCondition", itemCondition);
		return this;
	}

	/**
	 * Imposta la proprieta "availabilityStarts"</br>
	 * es:</br>
	 * "availabilityStarts": "2023-01-26"
	 * 
	 * @param availabilityStarts {@link LocalDate} o {@link String}
	 * @return {@link Offer} per abilitare la sintessi concatenata
	 */
	public Offer setAvailabilityStarts(LocalDate availabilityStarts) {
		set("availabilityStarts", availabilityStarts.toString());
		return this;
	}

	public Offer setAvailabilityStarts(String availabilityStarts) {
		set("availabilityStarts", availabilityStarts);
		return this;
	}

	/**
	 * Imposta la proprieta "availabilityEnds"</br>
	 * es:</br>
	 * "availabilityEnds": "2023-01-26"
	 * 
	 * @param availabilityEnds {@link LocalDate} o {@link String}
	 * @return {@link Offer} per abilitare la sintessi concatenata
	 */
	public Offer setAvailabilityEnds(LocalDate availabilityEnds) {
		set("availabilityEnds", availabilityEnds.toString());
		return this;
	}

	public Offer setAvailabilityEnds(String availabilityEnds) {
		set("availabilityEnds", availabilityEnds);
		return this;
	}

	/**
	 * Imposta la proprieta "offeredby"</br>
	 * es:</br>
	 * "OfferedBy": {"@type": "Hotel"}
	 * 
	 * @param offeredby oggetto di tipo {@link Organization} o una sua sottoclasse o
	 *                  {@link Person}
	 * @return {@link Offer} per abilitare la sintessi concatenata
	 */
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
