package core_java_topics.collectionFramework.comparableInterface;

public class Products implements Comparable<Products>{

	long product_id;
	String product_name;
	String product_features;
	double product_price;
	
	public Products(long product_id, String product_name, String product_features, double product_price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_features = product_features;
		this.product_price = product_price;
	}
	
	public int compareTo(Products prod) {
		if(product_id>prod.product_id)
			return 1;
		else if(product_id<prod.product_id)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "Products [product_id=" + product_id + ", product_name=" + product_name + ", product_features="
				+ product_features + ", product_price=" + product_price + "]";
	}

//     public int compareTo(Products prod) {
//		if(Product_id>Product prod) {
//			return 1;
//		}
//		else if(product_id<Product prod) {
//			return-1;
//		}
//		else 
//			return 0;
//	}
	
}
