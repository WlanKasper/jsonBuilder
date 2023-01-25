package jsonLdBuilder.schemas;

import java.time.LocalDate;

public class Review extends Thing {

	public Review(Person author, Rating rating) {
		super();
		setType(Types.REVIEW.getType());
		setAuthor(author);
		setRating(rating);
	}

	public Review setReviewRating(Rating reviewRating) {
		set("reviewRating", reviewRating.get());
		return this;
	}

	public Review setAuthor(Person author) {
		set("author", author.get());
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

	public Review setDatePublished(String datePublished) {
		set("datePublished", datePublished);
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

	public Review setInLanguage(String inLanguage) {
		set("inLanguage", inLanguage);
		return this;
	}

	public Review setIsFamilyFriendly(String isFamilyFriendly) {
		set("isFamilyFriendly", isFamilyFriendly);
		return this;
	}

}
