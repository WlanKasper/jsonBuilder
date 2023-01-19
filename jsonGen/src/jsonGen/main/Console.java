package jsonGen.main;

import java.util.ArrayList;
import java.util.List;

import jsonGen.bean.JSonGS;
import jsonGen.bean.JsonData;
import jsonGen.bean.Schema;
import jsonGen.extremeTesting.SchemaGetterSetterBuilder;
import jsonLdGen.schemas.Address;
import jsonLdGen.schemas.Hotel;
import jsonLdGen.schemas.Thing;

public class Console {

	public void exec() {

		List<JsonData> datas = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			String nameString = "name";
			String valueString = "nome del posto " + i;
			datas.add(new JsonData(nameString, valueString));
		}
		System.out.println(new ManB().writeJsonString(datas));
		System.out.println("finish");

	}

	public void exec2() throws NoSuchFieldException, NoSuchMethodException {
		
		Hotel hotel1 = new Hotel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, 0, null);
		hotel1.setName("The test");
		hotel1.setAddress(new Address("This is the new Address", "Italy", "Trieste", "34127", null, null, null));
//		new JsonLdStringComposer(hotel1);
//		SchemaGetterSetterBuilder builder = new SchemaGetterSetterBuilder();
//		builder.build("Hotel");
//		Schema schema = new Schema("Hotel");
//		schema.setName("The One");
//		schema.setAddressCountry("Italy");
//		schema.setStreetAddress("ye");
		new JsonLD(hotel1);
	}

}
