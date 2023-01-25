package jsonLdBuilder.schemas;

public class AggregateRating extends Rating {

//	private double ratingValue;
//	private int reviewCount;

	public AggregateRating(double ratingValue, int reviewCount) {
		super(ratingValue);
		setType(Types.AGGREGATERATING.getType());
//		setRatingValue(ratingValue);
		setReviewCount(reviewCount);
	}

	public AggregateRating setRatingValue(double ratingValue) {
		set("ratingValue", ratingValue);
		return this;
	}

	public AggregateRating setReviewCount(int reviewCount) {
		set("reviewCount", reviewCount);
		return this;
	}

}
