package jsonGen.main;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.htjava.json.JSonElem;
import org.htjava.json.JSonObj;
import org.htjava.json.Json;
import org.json.*;

import jsonGen.bean.Schema;

public class JsonLD {
	private JSonObj json;
	private Schema data;

	public JsonLD(Schema data) {
		this.data = data;
		json = new JSonObj();
		json = buildJson(data.gettype());
	}

	private JSonObj buildJson(String type) {
		switch (type) {
		case "Hotel":
			toJsonLD(buildHashMap("Hotel"));
			System.out.println(Json.writeToString(json));
			break;

		default:
			break;
		}
		return new JSonObj().add(null);
	}

	private void toJsonLD(HashMap<String, Object> map) {
		Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Object> entry = iterator.next();
			if (data.get(entry.getKey())!= null) {
				json.addObj(entry.getKey(), data.get(entry.getKey()));	
			}else {
//				json.addObj(entry.getKey(), null);
			}
			
		}
	}

//	private HashMap<String, Object> buildJsonMap(String type) {
//		HashMap<String, Object> map = new HashMap<>();	
//		String templateString = readJsonTemplate("./json/"+type+"Template.json");
//		List<String> propList = new ArrayList<>();
//		Collections.addAll(propList, templateString.split("\n"));
//		Pattern pattern = Pattern.compile("\"([^\"]*)\"");
//		boolean inner = false;
//		
//		for (String prop : propList) {
//			if (prop.indexOf('@')!= -1) {
//				if (prop.contains("@context")) {
//					map.put("@context", "http://www.schema.org");
//				}else {
//					String[] arrS = prop.split(":");
//					Matcher matcher = pattern.matcher(prop);
//					for (int i = 0; i <=arrS.length; i++) {
//						while (matcher.find()) {
//							 matcher.group(1);
//						}
//					}
//						map.put(arrS[0], arrS[1]);	
//				}
//				
//			}else if (prop.indexOf('{')!=-1) {
//				continue;
//			} else if (prop.indexOf('}') !=-1) {
//				return map;
//			}else {
//				Matcher matcher = pattern.matcher(prop);
//				while (matcher.find()) {
//					map.put(matcher.group(1), null);
//				}
//			}	
//		}	
//		return map;
//	}

	private HashMap<String, Object> buildHashMap(String type) {
		HashMap<String, Object> map = new HashMap<>();
		try {
			JSONTokener tokener = new JSONTokener(new FileReader("./json/" + type + "Template.json"));
			JSONObject json = new JSONObject(tokener);
			json.toMap().forEach((k, v) -> map.put(k.toString(), v));
//			System.out.println(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

//	private String readJsonTemplate(String fname) {
//		String jsonString = "";
//		try {
//			FileReader reader = new FileReader(fname);
//			int c;
//			while ((c = reader.read()) != -1) {
//				jsonString += (char) c;
//			}
//			reader.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return trimJson(jsonString);
//
//	}

//	private String trimJson(String str) {
//		String res = "";
//		boolean read = false;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == '{') {
//				read = true;
//			}
//			if (str.charAt(i) == '<') {
//				read = false;
//			}
//			if (read == true) {
//				res += (char) str.charAt(i);
//			}
//		}
//		return res;
//	}

}
