package jsonGen.extremeTesting;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.htjava.json.JSonObj;
import org.htjava.json.Json;
import org.json.JSONObject;
import org.json.JSONTokener;

import jsonLdBuilder.schemas.Hotel;

public class JsonLD {
	private List<Method> methods;

	public JsonLD(Object object) {
		methods = new ArrayList<>();
		findMethods(object.getClass().getName());
	}

	private void findMethods(String className) {
		try {
			Class<?> c = Class.forName(className);
			Method[] temp = c.getMethods();
			for (Method method : temp) {
				if (method.getName().startsWith("get")) {
					methods.add(method);
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public JSonObj toJsonLD(Object obj) {
		JSonObj jSonObj = new JSonObj();

		for (Method method : methods) {
			
		}
		return jSonObj;
	}

//	private JSonObj buildJson(String type) {
//		switch (type.toLowerCase()) {
//		case "hotel":
//			json = toJsonLD(buildHashMap(type));
//			System.out.println(Json.writeToString(json));
//			break;
//		case "address":
//			json = toJsonLD(buildHashMap(type));
//			return json;
//
//		default:
//			break;
//		}
//		return new JSonObj().add(null);
//	}

//	private JSonObj toJsonLD(HashMap<String, Object> map) {
//		JSonObj jSonObj = new JSonObj();
//		Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
//		while (iterator.hasNext()) {
//			Map.Entry<String, Object> entry = iterator.next();
//			if (entry.getKey().indexOf('@') != -1) {
//				String temp = entry.getKey().replaceAll("@", "");
////				prevType = data.getClass(); // backup can be removed
//				if (data.get(temp) != null) {
//					jSonObj.addObj(entry.getKey(), data.get(temp));
//					continue;
//				}
//			} else if (entry.getValue() instanceof Thing) {
//				System.out.println("inner");
//			} else if (entry.getValue() instanceof HashMap) {
//				HashMap<String, Object> innerMap = (HashMap<String, Object>) map.get(entry.getKey());
//				jSonObj.add(entry.getKey(), toJsonLD(innerMap));
//				continue;
//			} else if (data.get(entry.getKey()) != null) {
//				jSonObj.addObj(entry.getKey(), data.get(entry.getKey()));
//				continue;
//			}
//		}
//		return jSonObj;
//	}

	private HashMap<String, Object> buildHashMap() {
		HashMap<String, Object> map = new HashMap<>();
		try {
//			JSONObject json = new JSONObject(type);
//			JSONTokener tokener = new JSONTokener(new FileReader("./json/" + type.toLowerCase() + "Template.json"));
			JSONTokener tokener = new JSONTokener(new FileReader("./json/baseTemplate.json"));
//			JSONTokener tokener = new JSONTokener(new FileReader("./json/generated"+type+"Schema.json"));
			JSONObject json = new JSONObject(tokener);
			json.toMap().forEach((k, v) -> map.put(k.toString(), v));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
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
