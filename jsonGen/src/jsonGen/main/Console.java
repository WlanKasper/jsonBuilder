package jsonGen.main;

import java.util.ArrayList;
import java.util.List;

import jsonGen.bean.JsonData;

public class Console {

	public void exec() {
		
		List<JsonData> datas = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			String nameString = "name";
			String valueString = "nome del posto "+i;
			datas.add(new JsonData(nameString, valueString));
		}
		System.out.println(new ManB().writeJsonString(datas));
		System.out.println("finish");
		
	}

}
