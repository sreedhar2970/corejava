package core_java_topics.collectionFramework.mapInterface.hashMap.realtime2;

import java.util.Map;

public class Product {

	String product_name;
	Map<Long,ProductDetails> productMap;
	
	public Product(String product_name, Map<Long, ProductDetails> productMap) {
		super();
		this.product_name = product_name;
		this.productMap = productMap;
	}
	@Override
	public String toString() {
		return "Product [product_name=" + product_name + ", productMap=" + productMap + "]";
	}
}
