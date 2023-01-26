package jsonLdBuilder.schemas;

/**
 * Classe che rappresenta
 * <a href="https://schema.org/LodgingBusiness">schema.org/LodgingBusiness</a>
 * 
 * @author Matteo
 *
 */
public class LodgingBusiness extends LocalBusiness {
	public LodgingBusiness() {
		super();
	}

	/**
	 * Imposta la proprieta "amenityFeature"</br>
	 * es:</br>
	 * "amenityFeature": [{"@type": "LocationFeatureSpecification", "name": "Bar",
	 * "value": true}]
	 * 
	 * @param amenityFeature {@link String} servizio o caratteristica
	 * @return {@link LodgingBusiness } per abilitare la sintessi concatenata
	 */
	public LodgingBusiness setAmenityFeature(AmenityFeature amenityFeature) {
		set("amenityFeature", amenityFeature.setLocationFeatureSpecification());
		return this;
	}

	/**
	 * Imposta la proprieta "numberOfRooms"</br>
	 * es:</br>
	 * "numberOfRooms": 3
	 * 
	 * @param numberOfRooms
	 * @return {@link LodgingBusiness } per abilitare la sintessi concatenata
	 */
	public LodgingBusiness setNumberOfRooms(int numberOfRooms) {
		set("numberOfRooms", numberOfRooms);
		return this;
	}

	/**
	 * Imposta la proprieta "petsAllowed"</br>
	 * es:</br>
	 * "petsAllowed": false
	 * 
	 * @param petsAllowed
	 * @return {@link LodgingBusiness } per abilitare la sintessi concatenata
	 */
	public LodgingBusiness setPetsAllowed(boolean petsAllowed) {
		set("petsAllowed", petsAllowed);
		return this;
	}

	/**
	 * Imposta la proprieta "starRating"</br>
	 * es:</br>
	 * "starRating": "3.7"
	 * 
	 * @param starRating
	 * @return {@link LodgingBusiness } per abilitare la sintessi concatenata
	 */
	public LodgingBusiness setStarRating(double starRating) {
		set("starRating", starRating);
		return this;
	}

}