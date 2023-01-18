package jsonGen.bean;

public class Schema {
	private String type;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Schema(String type) {
		this.type = type;
	}

	public String gettype() {
		return type;
	}

	public void settype(String type) {
		this.type = type;
	}

	public Object get(String key) {
		switch (key) {
		case "type":
			return gettype();
		case "name":
			return getName();
		default:
			return null;
		}
	}

}
