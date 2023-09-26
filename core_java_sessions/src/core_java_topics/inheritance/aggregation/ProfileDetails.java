package core_java_topics.inheritance.aggregation;

public class ProfileDetails {

	private String cust_name;
	private String address;
	private String city;
	private String state;
	private long zipCode;
	private String panCard;
	public ProfileDetails(String cust_name, String address, String city, String state, long zipCode, String panCard) {
		super();
		this.cust_name = cust_name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.panCard = panCard;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
}
