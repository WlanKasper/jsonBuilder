package jsonLdGen.schemas;

public class Thing {

//	public static final String description = "";
//	public static final String image = "";
//	public static final String name = "";
//	public static final String url = "";

	protected String name;
	protected String description;
	protected String url;
	protected String image; // can be converted to a Image object, but we only use the url
	protected static final String context = "http://www.schema.org";
	protected String type = "Thing";

	public Thing(String name, String description, String url, String image) {
		this.name = name;
		this.description = description;
		this.url = url;
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public static String getContext() {
		return context;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
