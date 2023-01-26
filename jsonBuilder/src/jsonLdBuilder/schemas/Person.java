package jsonLdBuilder.schemas;

/**
 * Classe che rappresenta
 * <a href="https://schema.org/Person">schema.org/Person</a>
 * 
 * @author Matteo
 *
 */
public class Person extends Thing {

	public Person(String name) {
		setType(Types.PERSON.getType());
		setName(name);
	}

	/**
	 * Imposta la proprieta "naitonality"</br>
	 * es:</br>
	 * "nationality": {"@type": "Country", "name": "IT"}
	 * 
	 * @param nationality
	 * @return {@link Person} per abilitare la sintessi concatenata
	 */
	public Person setNationality(String country) {
		Thing nationality = new Thing();
		nationality.setType(Types.COUNTRY.getType());
		nationality.set("name", country);
		set("nationality", nationality.get());
		return this;
	}
}
