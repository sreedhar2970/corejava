package core_java_topics.collectionFramework.mapInterface.hashMap.realtime2;

import java.util.HashMap;
import java.util.Map;

public class ProductInformation {

	public static void main(String[] args) {
		// creating the product details object
		ProductDetails prod1 = new ProductDetails(111111l,"Samsung Galaxy 1", 20000.0d);
		ProductDetails prod2 = new ProductDetails(222222l,"Samsung Galaxy 2", 30000.0d);
		ProductDetails prod3 = new ProductDetails(333333l,"Samsung Galaxy 3", 40000.0d);
		
		Map<Long,ProductDetails> mapSamsung = new HashMap<Long, ProductDetails>();
		mapSamsung.put(11111l, prod1);
		mapSamsung.put(22222l, prod2);
		mapSamsung.put(22222l, prod3);
		
		ProductDetails prod4 = new ProductDetails(4444444l,"Oppo Mobile 1", 15000.0d);
		ProductDetails prod5 = new ProductDetails(5555555l,"Oppo Mobile 2", 25000.0d);
		ProductDetails prod6 = new ProductDetails(6666666l,"Oppo Mobile 3", 35000.0d);
		
		Map<Long,ProductDetails> mapOppo = new HashMap<Long, ProductDetails>();
		mapOppo.put(444444l, prod4);
		mapOppo.put(555555l, prod5);
		mapOppo.put(666666l, prod6);
				
		ProductDetails prod7 = new ProductDetails(7777777l,"Vivo 1", 10000.0d);
		ProductDetails prod8 = new ProductDetails(8888888l,"Vivo 2", 55000.0d);
		
		Map<Long,ProductDetails> mapVivo = new HashMap<Long, ProductDetails>();
		mapVivo.put(777777l, prod7);
		mapVivo.put(888888l, prod8);
		
		Map<String,Map<Long,ProductDetails>> productMap = new HashMap<String, Map<Long,ProductDetails>>();
		productMap.put("Samsung", mapSamsung);
		productMap.put("Oppo", mapOppo);
		productMap.put("Vivo", mapVivo);
		
		for(Map.Entry<String, Map<Long,ProductDetails>> product : productMap.entrySet()) {
			System.out.println("Product Name : " + product.getKey() + " Value : " + product.getValue());
		}
		
		
	}

}
