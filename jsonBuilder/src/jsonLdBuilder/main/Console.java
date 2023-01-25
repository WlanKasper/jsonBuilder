package jsonLdBuilder.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.htjava.json.Json;

import jsonLdBuilder.schemas.*;


public class Console {

	public void exec2() {
		Hotel hotel = new Hotel();
		hotel.setName("sku");
		hotel.setAddress(new Address().setAddressCountry(new AddressCountry().setAddressCountryName("Italy")));
//		hotel.setAggregateRating(new AggregateRating(3.5, 800));
//		hotel.setContactPoint(
//				new ContactPoint(new Place(new GeoCoordinates(46.103352, 10.845998))).setTelephone("33391023"));
		List<Review> reviews = new ArrayList<>();
		reviews.add(new Review(new Person("Chad").setNationality(new Thing().setName("COOL")), new Rating(4.5)));
//		reviews.add(new Review("Chad Bro", new Rating(5)).setDatePublished(LocalDate.now()));
		hotel.setReviews(reviews);
//		hotel.setGeo(new GeoCoordinates(33.12312, 6.434355));
//		hotel.setLocation(new Place(new GeoCoordinates(33.12312, 6.434355)));
//		hotel.setFounder(new Person("GIACOMO"));
//		ItemList offeredItemsItemList = new ItemList();
//		HashMap<String, String> itemsMap = new HashMap<>();
//		itemsMap.put(Types.OFFER.getType(), "Extreme one");
//		offeredItemsItemList.setItemListElement(itemsMap);// ask for what property should be added
//		OfferCatalog offerCatalogCamping = new OfferCatalog("Lampada catalog").addOfferCatalogList("Camping",
//				offeredItemsItemList);
//		hotel.setHasOfferCatalog(offerCatalogCamping);

		Offer offer = new Offer();
		offer.setContext().setName("Vacanza in montagna");
		offer.setDescription("La nostra casa vi offre un meraviglioso soggiorno\n"
				+ "in un appartamento accogliente e pulito.  Aspettano meravigliose\n"
				+ "escursioni e una zona sciistica con un panorama spettacolare.");
offer.setPrice(70.00).setPriceCurrency("EUR").setItemCondition("a notte, a persona, prima colazione").setAvailabilityStarts(LocalDate.now()).setAvailabilityEnds(LocalDate.now()).setOfferedBy(hotel);
		System.out.println(Json.writeToString(offer.get()));
	}

}
