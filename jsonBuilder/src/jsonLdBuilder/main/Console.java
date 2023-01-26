package jsonLdBuilder.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.htjava.json.Json;

//import jsonldtemp.*;
import jsonLdBuilder.schemas.Address;
import jsonLdBuilder.schemas.AddressCountry;
import jsonLdBuilder.schemas.AggregateRating;
import jsonLdBuilder.schemas.AmenityFeature;
import jsonLdBuilder.schemas.ContactPoint;
import jsonLdBuilder.schemas.GeoCoordinates;
import jsonLdBuilder.schemas.Hotel;
import jsonLdBuilder.schemas.ItemList;
import jsonLdBuilder.schemas.LocalBusiness;
import jsonLdBuilder.schemas.LodgingBusiness;
import jsonLdBuilder.schemas.Offer;
import jsonLdBuilder.schemas.OfferCatalog;
import jsonLdBuilder.schemas.Organization;
import jsonLdBuilder.schemas.Person;
import jsonLdBuilder.schemas.Place;
import jsonLdBuilder.schemas.Rating;
import jsonLdBuilder.schemas.Review;
import jsonLdBuilder.schemas.Types;

public class Console {

	public void exec2() {
		Hotel hotel = new Hotel();
//		List<String>imageStirngs= new ArrayList<>();
//		imageStirngs.add("sdafsdf");
//		imageStirngs.add("dfgdfgdfgdf");
//		hotel.setImage(imageStirngs);
//		hotel.setReviews(new R)
//		hotel.setName("sku");
//		hotel.setAddress(new Address().setAddressCountry(new AddressCountry().setAddressCountryName("Italy")));
//		hotel.setAggregateRating(new AggregateRating(3.5, 800));
//		hotel.setContactPoint(
//				new ContactPoint(new Place(new GeoCoordinates(46.103352, 10.845998))).setTelephone("33391023"));
//		List<Review> reviews = new ArrayList<>();
//		reviews.add(new Review(new Person("Chad").setNationality(new Thing().setName("COOL")), new Rating(4.5)));
//		hotel.setReviews(reviews)
//		;
//		hotel.setGeo(new GeoCoordinates(33.12312, 6.434355));
//		hotel.setLocation(new Place(new GeoCoordinates(33.12312, 6.434355)));
//		hotel.setFounder(new Person("GIACOMO"));
		ItemList offeredItemsItemList = new ItemList();
		HashMap<String, String> itemsMap = new HashMap<>();
		itemsMap.put(Types.OFFER.getType(), "Extreme one");
		offeredItemsItemList.setItemListElement(itemsMap);// ask for what property should be added
//		OfferCatalog offerCatalogCamping = new OfferCatalog("Lampada catalog").addOfferCatalogList("Camping",
//				offeredItemsItemList);
//		hotel.setHasOfferCatalog(offerCatalogCamping);
//		Thing thing = new Thing().setName(null);
		Offer offer = new Offer();
//		offer.setContext();
		offer.setDescription("La nostra casa vi offre un ...");
		offer.setPrice(70.00).setPriceCurrency("EUR").setItemCondition("a notte, a persona, prima colazione")
				.setAvailabilityStarts(LocalDate.now()).setAvailabilityEnds(LocalDate.now()).setOfferedBy(hotel);

		List<Review> reviews = new ArrayList<>();
		reviews.add(new Review(new Person("sku"), new Rating(3.5).setBestRating(4.3).setWorstRating(1))
				.setReviewBody("example").setDatePublished(LocalDate.now()).setItemReviewed("example")
				.setInLanguage("IT").setIsFamilyFriendly(true));

		Organization org = new Organization();
		org.setGeo(new GeoCoordinates(33.1, 123.33)).setTelephone("33333333").setEmail("example@example.it")
				.setAddress(new Address()).setLogo("url").setFounder(new Person("name"))
				.setAggregateRating(new AggregateRating(3, 1)).setAreaServed("IT")
				.setContactPoint(new ContactPoint(new Place(new GeoCoordinates(33.1, 123.33))))
				.setHasOfferCatalog(new OfferCatalog("example")).setHasPOS(new Place(new GeoCoordinates(33.1, 123.33)))
				.setLegalName("example").setLocation(new Place(new GeoCoordinates(33.1, 123.33))).setReviews(reviews);
//place.setAddress()

		Person person = new Person("name");
//offer.setItemOffered("Product", "Lampada");
		List<String> featureList = new ArrayList<>();
		featureList.add("Bar");
		featureList.add("restaurant");
		Place place = new Place(new GeoCoordinates(33.1, 123.33)).setAmenityFeature(new AmenityFeature(featureList));
		LodgingBusiness lodgingBusiness = new LodgingBusiness().setNumberOfRooms(3).setPetsAllowed(false)
				.setStarRating(3.7);

		person.setNationality("IT");
		
		ContactPoint cPoint=new ContactPoint(new Place(new GeoCoordinates(46.103352, 10.845998))).setTelephone("33391023").setContactOption("TollFree,HearingImpairedSupported");

		LocalBusiness localBusiness = new LocalBusiness().setPaymentAccepted("Cash, Credit Card").setPriceRange("$$$");
		
		AggregateRating rating = new AggregateRating(3.3, 20);
		Address adrAddress= new Address().setAddressCountry(new AddressCountry("IT"));
		System.out.println(Json.writeToString(adrAddress.get()));
	}

}
