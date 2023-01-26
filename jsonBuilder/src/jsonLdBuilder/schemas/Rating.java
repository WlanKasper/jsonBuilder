package jsonLdBuilder.schemas;

/**
 * 
 * Classe che rappresenta
 * <a href="https://schema.org/Rating">schema.org/Rating</a>
 * 
 * @author Matteo
 *
 */

public class Rating extends Thing {
	/**
	 * 
	 * @param ratingValue richiesto perche necessario per la
	 *                    validazione dell'oggetto
	 */
	public Rating(double ratingValue) {
		super();
//		setType(Types.RATING.getType());
		setRatingValue(ratingValue);
	}

	/**
	 * Imposta la proprieta "ratingValue"</br>
	 * es:</br>
	 * "ratingValue": "3.5"
	 * 
	 * @param rating
	 * @return {@link Rating} per abilitare la sintessi concatenata
	 */
	public Rating setRatingValue(double rating) {
		set("ratingValue", rating);
		return this;
	}

	/**
	 * Imposta la proprieta "bestRating"</br>
	 * es:</br>
	 * "bestRating": "4.3"
	 * 
	 * @param bestRating
	 * @return {@link Rating} per abilitare la sintessi concatenata
	 */
	public Rating setBestRating(double bestRating) {
		if (bestRating > 5) {
			throw new IllegalArgumentException("Best Rating can't be more than 5");
		} else {

			set("bestRating", bestRating);
		}
		return this;
	}

	/**
	 * Imposta la proprieta "worstRating"</br>
	 * es:</br>
	 * "worstRating": "1.0"
	 * 
	 * @param worstRating
	 * @return {@link Rating} per abilitare la sintessi concatenata
	 */
	public Rating setWorstRating(double worstRating) {
		if (worstRating < 1) {
			throw new IllegalArgumentException("Worst Rating can't be less than 1");
		} else {

			set("worstRating", worstRating);
		}
		return this;
	}

}
