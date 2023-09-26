package Inheritancepractice;

public class Address {
	
	private String village;
	private String city;
	private long postalcode;
	
	public Address(String village, String city, long postalcode) {
		super();
		this.village = village;
		this.city = city;
		this.postalcode = postalcode;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(long postalcode) {
		this.postalcode = postalcode;
	}

	@Override
	public String toString() {
		return "Address [village=" + village + ", city=" + city + ", postalcode=" + postalcode + "]";
	}

}
