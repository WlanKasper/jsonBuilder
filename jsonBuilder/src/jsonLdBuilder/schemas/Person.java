package jsonLdBuilder.schemas;

public class Person extends Thing{
	
	public Person(String name) {
		setType(Types.PERSON.getType());
		set("name", name);
	}
	
	public Person setNationality(Thing nationality) {
		nationality.setType(Types.COUNTRY.getType());
		set("nationality", nationality.get());
		return this;
	}
}
