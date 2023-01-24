package jsonLdBuilder.schemas;

import java.util.List;

import org.htjava.json.JSonArray;
import org.htjava.json.JSonObj;

public class Thing {

	protected JSonObj jObj;
	protected static final String context = "http://www.schema.org";

	public Thing() {
		jObj = new JSonObj();
		if (Thread.class.getClass().getName() == Types.THING.getType()) {
			setContext();
			setType(Types.THING.getType());
		}

	}

	public void set(String key, Object obj) {
		if (obj != null) {
			jObj.addObj(key, obj);
		}
	}

	public Thing setArray(String key, JSonArray jArray) {
		set(key, jArray);
		return this;
	}

	public Thing setName(String name) {
		set("name", name);
		return this;
	}

	public Thing setDescription(String description) {
		set("description", description);
		return this;
	}

	public Thing setUrl(String url) {
		set("url", url);
		return this;
	}

	public Thing setImage(List<String> images) {
		JSonArray jArray = new JSonArray();
		for (String image : images) {
			jArray.add(image);
		}
		set("image", jArray);
		return this;
	}

	public Thing setPhotos(List<String> photosURLs) {
		JSonArray jArray = new JSonArray();
		for (String photoURL : photosURLs) {
			jArray.add(photoURL);
		}
		set("photo", jArray);
		return this;
	}

	public Thing setType(String type) {
		set("@type", type);
		return this;
	}

	public Thing setContext() {
		jObj.add("@context", context);
		return this;
	}

	public JSonObj get() {
		return jObj;
	}

}
