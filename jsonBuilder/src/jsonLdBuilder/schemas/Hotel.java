package jsonLdBuilder.schemas;

/**
 * Classe che rappresenta
 * <a href="https://schema.org/Hotel">schema.org/Hotel</a>
 * 
 * @author Matteo
 *
 */
public class Hotel extends LodgingBusiness {

	public Hotel() {
		super();
		setType(Types.HOTEL.getType());
	}

}
