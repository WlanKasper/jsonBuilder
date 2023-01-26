package jsonLdBuilder.schemas;

import java.util.List;

import org.htjava.json.JSonArray;

/**
 * Classe che rappresenta
 * <a href="https://schema.org/amenityFeature">schema.org/amenityFeature</a>
 * 
 * @author Matteo
 *
 */
public class AmenityFeature extends Thing {
	private List<String> featureList;
/**
 * 
 * @param featureList Lista di {@link String} che contiene il nome di tutte le feature
 */
	public AmenityFeature(List<String> featureList) {
		super();
		this.featureList = featureList;
	}
/**
 * 
 * @return {@link JSonArray } contenente tutti gli oggetti specificante le feature
 */
	protected JSonArray setLocationFeatureSpecification() {
		JSonArray jArray = new JSonArray();
		for (String string : featureList) {
			Thing temp = new Thing();
			temp.setType(Types.AMENITYFEATURE.getType());
			temp.setName(string);
			temp.set("value", true);
			jArray.addObj(temp.get());
		}
		return jArray;
	}

}
