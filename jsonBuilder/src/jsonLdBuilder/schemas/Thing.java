package jsonLdBuilder.schemas;

import java.util.List;

import org.htjava.json.JSonArray;
import org.htjava.json.JSonObj;

/**
 * Classe che rappresenta
 * <a href="https://schema.org/Thing">schema.org/Thing</a> con le proprieta utilizzate
 * 
 * @author Matteo
 *
 */

public class Thing {
	/**
	 * JSonObj jObj e l'oggetto json-LD che viene costruito e poi verra ritornato
	 * tramite {@link #get()}
	 */
	protected JSonObj jObj;
	protected static final String context = "http://www.schema.org";

	public Thing() {
		jObj = new JSonObj();
		if (Thread.class.getClass().getName() == Types.THING.getType()) {
			setContext();
			setType(Types.THING.getType());
		}

	}

	/**
	 * Imposta in modo generico una proprita all'interno di {@link #jObj}<br>
	 * es:</br>
	 * "key":"c"
	 * 
	 * @param key c
	 * @param obj Oggetto da inserire all'interno di {@link #jObj}
	 */
	public void set(String key, Object obj) {
		if (obj != null) {
			jObj.addObj(key, obj);
		}
	}

	/**
	 * Imposta in modo generico un array all'interno di {@link #jObj}<br>
	 * es:</br>
	 * "key":["content"]
	 * 
	 * @param key    Stringa per il nome della proprieta
	 * @param jArray array di tipo JSonArray da inserire all'inerno di {@link #jObj}
	 * @return {@link Thing} per abilitare la sintessi concatenata this per abilitare la
	 *         sintessi concatenata
	 */
	public Thing setArray(String key, JSonArray jArray) {
		set(key, jArray);
		return this;
	}

	/**
	 * Imposta la proprieta "name" <br>
	 * es:</br>
	 * "name":"example"
	 * 
	 * @param name Stringa del nome
	 * @return {@link Thing} per abilitare la sintessi concatenata
	 */
	public Thing setName(String name) {
		set("name", name);
		return this;
	}

	/**
	 * Imposta la proprieta "description" <br>
	 * es:</br>
	 * "description":"example"
	 * 
	 * @param description
	 * @return {@link Thing} per abilitare la sintessi concatenata
	 */
	public Thing setDescription(String description) {
		set("description", description);
		return this;
	}

	/**
	 * Imposta la proprieta "url" <br>
	 * es:</br>
	 * "url": "www.exaple.com"
	 * 
	 * @param url String per l'URL della pagina o oggetto
	 * @return {@link Thing} per abilitare la sintessi concatenata
	 */
	public Thing setUrl(String url) {
		set("url", url);
		return this;
	}

	/**
	 * Imposta la proprieta "image" <br>
	 * es:</br>
	 * "image":["www.example1.com","www.example2.com"]
	 * 
	 * @param images Lista di String per gli URL delle immagini
	 * @return {@link Thing} per abilitare la sintessi concatenata 
	 */
	public Thing setImage(List<String> images) {
		JSonArray jArray = new JSonArray();
		for (String image : images) {
			jArray.add(image);
		}
		set("image", jArray);
		return this;
	}

	/**
	 * Imposta la proprieta "image"<br>
	 * es:</br>
	 * "image":"www.example.com"
	 * 
	 * @param image Stringa che contiene l'URL dell'immagine
	 * @return {@link Thing} per abilitare la sintessi concatenata 
	 */
	public Thing setImage(String image) {
		set("image", image);
		return this;
	}

	/**
	 * Imposta la proprieta "photo"<br>
	 * es:</br>
	 * "photo":["www.example1.com","www.example2.com"]
	 * 
	 * @param photosURLs Lista di String che contiene gli URL delle foto
	 * @return {@link Thing} per abilitare la sintessi concatenata 
	 */
	public Thing setPhotos(List<String> photosURLs) {
		JSonArray jArray = new JSonArray();
		for (String photoURL : photosURLs) {
			jArray.add(photoURL);
		}
		set("photo", jArray);
		return this;
	}

	/**
	 * Imposta la proprieta "photo"<br>
	 * es:</br>
	 * "photo":"www.example.com"
	 * 
	 * @param photoURL Stringa che contiene l'URL della foto
	 * @return {@link Thing} per abilitare la sintessi concatenata
	 */
	public Thing setPhotos(String photoURL) {
		set("photo", photoURL);
		return this;
	}

	/**
	 * Imposta la proprieta "@type"<br>
	 * es:</br>
	 * "@type":"Thing"
	 * 
	 * @param type
	 * @return {@link Thing} per abilitare la sintessi concatenata
	 */
	public Thing setType(String type) {
		set("@type", type);
		return this;
	}

	/**
	 * Imposta la proprieta "@context"
	 * 
	 * @return {@link Thing} per abilitare la sintessi concatenata
	 */
	public Thing setContext() {
		jObj.add("@context", context);
		return this;
	}

	/**
	 * Comando che restituisce l'attributo JSonObj {@link #jObj}
	 * 
	 * @return {@link JSonObj} {@link #jObj}
	 */
	public JSonObj get() {
		return jObj;
	}

}
