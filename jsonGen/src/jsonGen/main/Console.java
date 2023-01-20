package jsonGen.main;

import org.htjava.json.Json;

//import jsonLdGen.schemas.Address;
import jsonLdGen.schemas.Address;
import jsonLdGen.schemas.Hotel;

public class Console {

//	public void exec() {
//
//		List<JsonData> datas = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			String nameString = "name";
//			String valueString = "nome del posto " + i;
//			datas.add(new JsonData(nameString, valueString));
//		}
//		System.out.println(new ManB().writeJsonString(datas));
//		System.out.println("finish");
//
//	}

	public void exec2() {
		Hotel hotel1 = new Hotel();
		hotel1.setName("The test");
		hotel1.setStarRating(3.5);
		hotel1.setAddress(new Address("This is the new Address", "Italy", "Trieste", "34127", null, null, null));
//		new JsonLdStringComposer(hotel1);
//		SchemaGetterSetterBuilder builder = new SchemaGetterSetterBuilder();
//		builder.build("Hotel");
//		Schema schema = new Schema("Hotel");
//		schema.setName("The One");
//		schema.setAddressCountry("Italy");
//		schema.setStreetAddress("ye");
		
		System.out.println(Json.writeToString(new JsonLD(hotel1).toJsonLD(hotel1)));
		
	}

}
