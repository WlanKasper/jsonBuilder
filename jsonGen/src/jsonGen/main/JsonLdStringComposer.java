package jsonGen.main;

import java.io.Writer;

import org.htjava.json.JSonObj;
import org.htjava.json.Json;

import jsonLdGen.schemas.Hotel;

public class JsonLdStringComposer {
	
	JSonObj jSonObj;
	
	public JsonLdStringComposer(Hotel hotel) {
		jSonObj = new JSonObj();
		System.out.println(Json.writeToString(jSonObj));
	}

}
