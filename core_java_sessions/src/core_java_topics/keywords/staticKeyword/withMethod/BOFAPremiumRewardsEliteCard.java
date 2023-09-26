package core_java_topics.keywords.staticKeyword.withMethod;

public class BOFAPremiumRewardsEliteCard {

	long rec_cust_id;
	String rec_holder_name;
	String expiry_date;
	int cvv_number;
	double rec_cc_limit;
	static String BANK_NAME = "HDFC Bank";
	
	public BOFAPremiumRewardsEliteCard(long rec_cust_id, String rec_holder_name, String expiry_date, int cvv_number,
			double rec_cc_limit) {
		super();
		this.rec_cust_id = rec_cust_id;
		this.rec_holder_name = rec_holder_name;
		this.expiry_date = expiry_date;
		this.cvv_number = cvv_number;
		this.rec_cc_limit = rec_cc_limit;
	}

	static void changeBankName() {
		BANK_NAME = "Bank Of America";
	}
	
	public void displayRECInfo() {
		System.out.println("============ Credit Card Details =================");
		System.out.println("Cust id : " + rec_cust_id);
		System.out.println("Customer Name : " + rec_holder_name);
		System.out.println("Expiry Date : " + expiry_date);
		System.out.println("Cvv Number : " + cvv_number);
		System.out.println("Credit card limit : " + rec_cc_limit);
		System.out.println("Bank Name : " + BANK_NAME);
	}
	
	public static void main(String[] args) {
		BOFAPremiumRewardsEliteCard.changeBankName();// to change the bank name.....
		BOFAPremiumRewardsEliteCard card1 = new BOFAPremiumRewardsEliteCard(12345l,"Mohammed Kamran","23-09-2029", 543,60000.0d);
		BOFAPremiumRewardsEliteCard card2 = new BOFAPremiumRewardsEliteCard(12348l,"Mohammed Zeeshan","16-04-2033",634,80000.0d);
		
		card1.displayRECInfo();
		card2.displayRECInfo();
	}
}
