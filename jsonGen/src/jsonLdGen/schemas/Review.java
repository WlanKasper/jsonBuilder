package jsonLdGen.schemas;

import java.time.LocalDate;

public class Review extends Thing {
//	private String author;
//	private String reviewBody;
//	private LocalDate datePublished;
//	private int rating;
//	private String itemReviewed;

	public Review(String author,Rating rating) {
		super();
		setType(Types.REVIEW.getType());
		setAuthor(author);
		setRating(rating);
	}

	public Review setReviewRating(Rating reviewRating) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, reviewRating.get());
		return this;
	}

	public void setAuthor(String author) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, author);
	}

	public void setReviewBody(String reviewBody) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, reviewBody);
	}

	public void setDatePublished(LocalDate datePublished) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, datePublished.toString());
	}

	public void setRating(Rating rating) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, rating.get());
	}

	public void setItemReviewed(String itemReviewed) {
		String str = Thread.currentThread().getStackTrace()[1].getMethodName();
		str = str.substring(str.indexOf("t") + 1, str.length());
		jObj.addObj(str, itemReviewed);
	}

}
