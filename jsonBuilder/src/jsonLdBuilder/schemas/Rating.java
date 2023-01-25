package jsonLdBuilder.schemas;

public class Rating extends Thing {
//	private double rating;
//	private int bestRating;
//	private int worstRating;

	public Rating(double ratingValue) {
		super();
		setRatingValue(ratingValue);
	}

	public Rating setRatingValue(double rating) {
		set("ratingValue", rating);
		return this;
	}

	public Rating setBestRating(int bestRating) {

		set("bestRating", bestRating);
		return this;
	}

	public Rating setWorstRating(int worstRating) {

		set("worstRating", worstRating);
		return this;
	}

}
