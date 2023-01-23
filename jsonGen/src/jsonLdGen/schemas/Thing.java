package jsonLdGen.schemas;

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

	public void setName(String name) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, name);
	}

	public void setDescription(String description) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, description);
	}

	public void setUrl(String url) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, url);
	}

	public void setImage(String image) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, image);
	}

	public void setType(String string) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj("@" + str.toLowerCase(), string);
	}

	public void setContext() {
		jObj.add("@context", context);
	}

	public JSonObj get() {
		return jObj;
	}

	

}
