package core_java_topics.collectionFramework.mapInterface.linkedHashMap.realtime;

import java.util.LinkedHashMap;
import java.util.Map;

public class BookDetails {

	public static void main(String[] args) {

		LinkedHashMap<Long, Books> mapObject = new LinkedHashMap<Long, Books>();
		
		Books book1 = new Books(9353162343l, "Programming with Java | 6th Edition ","The sixth edition of this most trusted book on JAVA for beginners is here with some essential updates.", 600.0d);
		Books book2 = new Books(9351199258l, "Core Java: An Integrated Approach, New: Includes All Versions Upto Java 8 ", "An Integrated Approach covers all core concepts in a methodical way.", 700.0d);
		Books book3 = new Books(9355323719l, "JAVA: THE COMPLETE REFERENCE ,12TH EDITION ", "The definitive guide to Java programming—thoroughly revised for Java SE 17 Fully updated for the current version of Java", 800.0d);
		
		mapObject.put(9351199258l, book2);
		mapObject.put(9353162343l, book1);
		mapObject.put(9355323719l, book3);
		
		// traverse over the map object
		for(Map.Entry<Long, Books> book : mapObject.entrySet()) {
			long prod_id = book.getKey();
			Books b = book.getValue();
			System.out.println(prod_id + " Details");
			System.out.println(b.product_name + " " + b.product_descr + " " + b.product_price);
		}
		
	}

}
