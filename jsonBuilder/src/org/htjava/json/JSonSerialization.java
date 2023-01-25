package org.htjava.json;

import java.lang.reflect.Field;

/**
 * Interface usato per la serializzazione di una classe in un JSON Object<br>
 * la classe che la implementa deve avere solo attributi di tipi gestiti dal
 * metodo {@link Json#fromObj()} per permettere la serializzazione automatica
 * degli attributi della classe in JSonObj tramite reflection!</b><br>
 * Usato ad esempio in com.xlbit.yesalps.gmap.GmapMarker
 * 
 * @author arban
 */
public interface JSonSerialization {

	public default JSonObj toJsonObj() throws IllegalArgumentException, IllegalAccessException {
		JSonObj jsonObj = new JSonObj();
		for (Field field : getClass().getDeclaredFields()) {
			field.setAccessible(true);
			Object attribute = field.get(this);
			if (attribute != null) {
				jsonObj.addObj(field.getName(), attribute);
			}
		}
		return jsonObj;
	}
}
