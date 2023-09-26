package core_java_topics.collectionFramework.mapInterface.hashMap.realtime2;

public class ProductDetails {

	long produt_id;
	String product_name;
	double product_price;
	
	public ProductDetails(long produt_id, String product_name, double product_price) {
		super();
		this.produt_id = produt_id;
		this.product_name = product_name;
		this.product_price = product_price;
	}
	@Override
	public String toString() {
		return "ProductDetails [produt_id=" + produt_id + ", product_name=" + product_name+ ", product_price="
				+ product_price + "]";
	}
	
}
