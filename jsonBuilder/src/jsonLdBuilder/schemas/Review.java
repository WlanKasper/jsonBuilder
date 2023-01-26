package jsonLdBuilder.schemas;

import java.time.LocalDate;

/**
 * Classe che rappresenta
 * <a href="https://schema.org/Review">schema.org/Review</a>
 * 
 * @author Matteo
 *
 */
public class Review extends Thing {
	/**
	 * 
	 * @param author       {@link Person} autore
	 * @param reviewRating {@link Rating}
	 */
	public Review(Person author, Rating reviewRating) {
		super();
		setType(Types.REVIEW.getType());
		setAuthor(author);
		setReviewRating(reviewRating);
	}

	/**
	 * Imposta la proprieta "reviewRating" con un oggetto interno {@link Rating} con
	 * "@type": "Rating"</br>
	 * es:</br>
	 * "reviewRating": { "@type": "Rating", "ratingValue": "3.5", "bestRating":
	 * "4.3", "worstRating": "1.0" }</br>
	 * 
	 * @param reviewRating {@link Rating}
	 * @return {@link Review} per abilitare la sintassi concatenata
	 */
	public Review setReviewRating(Rating reviewRating) {
		set("reviewRating", reviewRating.get());
		return this;
	}

	/**
	 * Imposta la proprieta "author" con un oggetto interno {@link Person} con
	 * "@type":"Person"</br>
	 * es:</br>
	 * "author": {"@type": "Person", "name": "sku"}
	 * 
	 * @param author {@link Person} autore
	 * @return {@link Review} per abilitare la sintassi concatenata
	 */
	public Review setAuthor(Person author) {
		set("author", author.get());
		return this;
	}

	/**
	 * Imposta la proprieta "reviewBody"</br>
	 * es:</br>
	 * "reviewBody": "example"
	 * 
	 * @param reviewBody
	 * @return {@link Review} per abilitare la sintassi concatenata
	 */
	public Review setReviewBody(String reviewBody) {

		set("reviewBody", reviewBody);
		return this;
	}

	/**
	 * Imposta la proprieta "datePublished"</br>
	 * es:</br>
	 * "datePublished": "2023-01-25"
	 * 
	 * @param datePublished {@link LocalDate} o {@link String}
	 * @return {@link Review} per abilitare la sintassi concatenata
	 */
	public Review setDatePublished(LocalDate datePublished) {

		set("datePublished", datePublished.toString());
		return this;
	}

	/**
	 * Imposta la proprieta "datePublished"</br>
	 * es:</br>
	 * "datePublished": "2023-01-25"
	 * 
	 * @param datePublished {@link LocalDate} o {@link String}
	 * @return {@link Review} per abilitare la sintassi concatenata
	 */
	public Review setDatePublished(String datePublished) {
		set("datePublished", datePublished);
		return this;
	}

	/**
	 * Imposta la proprieta "itemReviewed"</br>
	 * es:</br>
	 * "itemReviewed": "example"
	 * 
	 * @param itemReviewed
	 * @return {@link Review} per abilitare la sintassi concatenata
	 */
	public Review setItemReviewed(String itemReviewed) {

		set("itemReviewed", itemReviewed);
		return this;
	}

	/**
	 * Imposta la proprieta "inLanguage"</br>
	 * es:</br>
	 * "inLanguage": "IT"
	 * 
	 * @param inLanguage
	 * @return {@link Review} per abilitare la sintassi concatenata
	 */
	public Review setInLanguage(String inLanguage) {
		set("inLanguage", inLanguage);
		return this;
	}

	/**
	 * Imposta la proprieta "isFamilyFriendly"</br>
	 * es:</br>
	 * "isFamilyFriendly": true
	 * 
	 * @param isFamilyFriendly {@link String} o {@link Boolean}
	 * @return {@link Review} per abilitare la sintassi concatenata
	 */
	public Review setIsFamilyFriendly(String isFamilyFriendly) {
		set("isFamilyFriendly", isFamilyFriendly);
		return this;
	}

	/**
	 * Imposta la proprieta "isFamilyFriendly"</br>
	 * es:</br>
	 * "isFamilyFriendly": true
	 * 
	 * @param isFamilyFriendly {@link String} o {@link Boolean}
	 * @return {@link Review} per abilitare la sintassi concatenata
	 */
	public Review setIsFamilyFriendly(boolean isFamilyFriendly) {
		set("isFamilyFriendly", isFamilyFriendly);
		return this;
	}

}
