package core_java_topics.collectionFramework.comparableInterface;

import java.util.ArrayList;
import java.util.Collections;

public class SortingProductBasedOnPrice {

	public static void main(String[] args) {

		ArrayList<Products> listOfProducts = new ArrayList<Products>();
		
		listOfProducts.add(new Products(123456789l, "vivo Y01 (Elegant Black, 32 GB)", "2 GB RAM | 32 GB ROM 16.54 cm (6.51 inch) Display",7999.0d));
		listOfProducts.add(new Products(123456788l, "vivo Y02 (Cosmic Grey, 32 GB)", "8MP Rear Camera | 5MP Front Camera 5000 mAh", 9498.0d));
		listOfProducts.add(new Products(123456786l, "vivo Y1s (Aurora Blue, 32 GB)", "The Vivo Y1s is a sleek, elegant, and powerful", 9450.0d));
		listOfProducts.add(new Products(123456784l, "vivo Y02t (Sunset Gold, 64 GB)", "8MP Rear Camera | 5MP Front Camera 5000 mAh ", 9999.0d));
		listOfProducts.add(new Products(123456781l, "vivo Y91i (Ocean Blue, 32 GB)", "Browse quickly, click everything you see", 9990.0d));
		listOfProducts.add(new Products(123456783l, "vivo U10 (Electric Blue, 32 GB)", "3 GB RAM | 32 GB ROM | Expandable Upto 256 GB", 10900.0d));
		listOfProducts.add(new Products(123456785l, "vivo Y15c (Wave Green, 32 GB)", "13MP + 2MP | 8MP Front Camera", 13990.0d));
		listOfProducts.add(new Products(123456782l, "vivo Y15c (Mystic Blue, 64 GB)", "Handset, Documentation, USB Cable", 11290.0d));
	
		Collections.sort(listOfProducts);
		for(Products prod : listOfProducts) {
			System.out.println(prod);
		}
	
	}

}
