package jsonGen.extremeTesting;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;

import jsonGen.bean.JsonData;

public class ManB {
	
	private JSONObject json;
	
	public ManB() {
	}
	
	private void setJsonTemplate() {
            json = new JSONObject(readJsonString("./json/hotelTemplate.json"));
	}
	
	public String writeJsonString(List<JsonData> data) {
		String resString ="";
		for (JsonData str : data) {
//			setJsonTemplate(); //togliere commento per usare template
			json = new JSONObject(generateMap(data)); //commentare per usare template
//			if (json.has(str.getName())) { //togliere commento per usare template
//				json.put(str.getName(),str.getValue());	
//		}//togliere commento per usare template
			resString+= json.toString() +"\n";
		}
		return resString;
	}
	
	private String readJsonString(String fname) {
		String jsonString = "";
		try {
            FileReader reader = new FileReader(fname);
            int c;
            while((c = reader.read()) != -1) {
                jsonString += (char)c;
            }
            reader.close();
		} catch (IOException e) {
            e.printStackTrace();
        }
		return trimJson(jsonString);
		
	}
	
	private String trimJson(String str) {
		String  res="";
		boolean read= false;
		for(int i =0; i< str.length();i++) {
			if (str.charAt(i)=='{') {
				read= true;
			}
			if (str.charAt(i)=='<') {
				read = false;
			}
			if (read==true) {
				res += (char)str.charAt(i);
			}
		}
		return res;
	}
	
	private HashMap<String, Object> generateMap(List<JsonData> data) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		for (JsonData elem : data) {
			map.put(elem.getName(), elem.getValue());
		}
		return map;
	}

}
