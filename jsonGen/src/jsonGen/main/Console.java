package jsonGen.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.htjava.json.Json;

//import jsonLdGen.schemas.Address;
import jsonLdGen.schemas.Address;
import jsonLdGen.schemas.AggregateRating;
import jsonLdGen.schemas.ContactPoint;
import jsonLdGen.schemas.GeoCoordinates;
import jsonLdGen.schemas.Hotel;
import jsonLdGen.schemas.Place;
import jsonLdGen.schemas.Review;
import jsonLdGen.schemas.Rating;
import jsonLdGen.schemas.Thing;

public class Console {

//	public void exec() {
//
//		List<JsonData> datas = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			String nameString = "name";
//			String valueString = "nome del posto " + i;
//			datas.add(new JsonData(nameString, valueString));
//		}
//		System.out.println(new ManB().writeJsonString(datas));
//		System.out.println("finish");
//
//	}

	public void exec2() {
		Hotel hotel = new Hotel();
		hotel.setContext();
		hotel.setAddress(new Address().setAddressCountry("IT").setPostalCode("34127"));
		hotel.setAggregateRating(new AggregateRating(new Rating(3.5), 3.5, 800));
		hotel.setContactPoint(
				new ContactPoint(new Place(new GeoCoordinates(46.103352, 10.845998))).setTelephone("33391023"));
		List<Review> reviews = new ArrayList<>();
		reviews.add(new Review("Goodman", new Rating(4.5)));
		reviews.add(new Review("Chad Bro", new Rating(5)));
		hotel.setReviews(reviews);
		hotel.setLocation(new Place(new GeoCoordinates(33.12312, 6.434355)));
		hotel.setName("The test");
//		Thing tesThing = new Thing();
//		tesThing.setName("sku");
//		Place skuPlace = new Place();
//		skuPlace.setAddress("yeah man");
//		tesThing.getThing().addObj("address", skuPlace.getThing());
		System.out.println(Json.writeToString(hotel.get()));

	}

}
