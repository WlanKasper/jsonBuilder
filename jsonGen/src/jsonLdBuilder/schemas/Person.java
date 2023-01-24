package jsonLdBuilder.schemas;

public class Person extends Thing{
	
	public Person(String name) {
		setType(Types.PERSON.getType());
		set("name", name);
	}
}
