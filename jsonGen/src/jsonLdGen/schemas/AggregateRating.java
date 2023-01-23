package jsonLdGen.schemas;

public class AggregateRating extends Thing {

//	private double ratingValue;
//	private int reviewCount;

	public AggregateRating(Rating starRating, double ratingValue, int reviewCount) {
		super();
		setType(Types.AGGREGATERATING.getType());
		setRatingValue(ratingValue);
		setReviewCount(reviewCount);
		jObj.addObj("starRating", starRating.get());
	}

	public void setRatingValue(double ratingValue) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, ratingValue);
	}

	public void setReviewCount(int reviewCount) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, reviewCount);
	}

}
