package jsonLdBuilder.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.htjava.json.Json;

import jsonLdBuilder.schemas.*;

public class Console {

	public void exec2() {
		Hotel hotel = new Hotel();
		hotel.setContext().setName("sku");
		hotel.setAddress(new Address().setAddressCountry("IT").setPostalCode("34127"));
		hotel.setAggregateRating(new AggregateRating(3.5, 800));
		hotel.setContactPoint(
				new ContactPoint(new Place(new GeoCoordinates(46.103352, 10.845998))).setTelephone("33391023"));
		List<Review> reviews = new ArrayList<>();
		reviews.add(new Review("Goodman", new Rating(4.5)));
		reviews.add(new Review("Chad Bro", new Rating(5)).setDatePublished(LocalDate.now()));
		hotel.setReviews(reviews);
		hotel.setGeo(new GeoCoordinates(33.12312, 6.434355));
		hotel.setLocation(new Place(new GeoCoordinates(33.12312, 6.434355)));
		hotel.setFounder(new Person("GIACOMO"));
		ItemList offeredItemsItemList = new ItemList();
		HashMap<String, String> itemsMap = new HashMap<>();
		itemsMap.put(Types.OFFER.getType(), "Extreme one");
		offeredItemsItemList.setItemListElement(itemsMap);//ask for what property should be added 
		OfferCatalog offerCatalogCamping = new OfferCatalog("Lampada catalog").addOfferCatalogList("Camping",offeredItemsItemList);
		hotel.setHasOfferCatalog(offerCatalogCamping);
		System.out.println(Json.writeToString(hotel.get()));
	}

}
