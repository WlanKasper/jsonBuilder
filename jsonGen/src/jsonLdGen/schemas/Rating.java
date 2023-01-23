package jsonLdGen.schemas;

public class Rating extends Thing {
//	private double rating;
//	private int bestRating;
//	private int worstRating;
	
	public Rating(double ratingValue) {
		super();
		setType(Types.RATING.getType());
		setRatingValue(ratingValue);
	}

	public Rating setRatingValue(double rating) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, rating);
		return this;
	}

	public void setBestRating(int bestRating) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, bestRating);
	}

	public void setWorstRating(int worstRating) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, worstRating);
	}
	
}
