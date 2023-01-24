package jsonLdBuilder.schemas;

import java.time.LocalDate;

public class Review extends Thing {
//	private String author;
//	private String reviewBody;
//	private LocalDate datePublished;
//	private int rating;
//	private String itemReviewed;

	public Review(String author, Rating rating) {
		super();
		setType(Types.REVIEW.getType());
		setAuthor(author);
		setRating(rating);
	}

	public Review setReviewRating(Rating reviewRating) {
		set("reviewRating", reviewRating.get());
		return this;
	}

	public Review setAuthor(String author) {
		set("author", author);
		return this;
	}

	public Review setReviewBody(String reviewBody) {

		set("reviewBody", reviewBody);
		return this;
	}

	public Review setDatePublished(LocalDate datePublished) {

		set("datePublished", datePublished.toString());
		return this;
	}

	public Review setRating(Rating rating) {

		set("reviewRating", rating.get());
		return this;
	}

	public Review setItemReviewed(String itemReviewed) {

		set("itemReviewed", itemReviewed);
		return this;
	}

}
