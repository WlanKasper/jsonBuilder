package jsonLdBuilder.schemas;

/**
 * Classe che rappresenta
 * <a href="https://schema.org/AggregateRating">schema.org/AggregateRating</a>
 * 
 * @author Matteo
 *
 */
public class AggregateRating extends Rating {

	/**
	 * Costruttore che richiede i parametri necessari per la validazione dello
	 * schema
	 * 
	 * @param ratingValue
	 * @param reviewCount
	 */
	public AggregateRating(double ratingValue, int reviewCount) {
		super(ratingValue);
		setType(Types.AGGREGATERATING.getType());
		setReviewCount(reviewCount);
	}

//	public AggregateRating setRatingValue(double ratingValue) {
//		set("ratingValue", ratingValue);
//		return this;
//	}
	/**
	 * Imposta la proprieta "reviewCount"</br>
	 * es:</br>
	 * "reviewCount": 20
	 * 
	 * @param reviewCount
	 * @return {@link AggregateRating} per abilitare la sintessi concatenata
	 */
	protected AggregateRating setReviewCount(int reviewCount) {
		set("reviewCount", reviewCount);
		return this;
	}

}
