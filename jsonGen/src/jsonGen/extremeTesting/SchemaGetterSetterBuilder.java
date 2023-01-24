package jsonGen.extremeTesting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class SchemaGetterSetterBuilder {

	private Document doc;
	JsonObject jsonObject;

	public SchemaGetterSetterBuilder() {

	}

	

	public void build(String type) {
		try {
			doc = Jsoup.connect("https://schema.org/" + type).get();
			Elements scriptElements = doc.getElementsByTag("script");
			String jsonString = null;
			for (Element scriptElement : scriptElements) {
				if (scriptElement.attr("type").equals("application/ld+json")) {
					jsonString = scriptElement.html();
					break;
				}
			}

			Gson gson = new Gson();
			jsonObject = gson.fromJson(jsonString, JsonObject.class);

			File file = new File("./json/generated" + type + "Schema.json");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fileWriter = new FileWriter("./json/generated" + type + "Schema.json");
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(jsonString);
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public JsonObject getJsonObject() {
		return jsonObject;
	}

	public void setJsonObject(JsonObject jsonObject) {
		this.jsonObject = jsonObject;
	}

}
