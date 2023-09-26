package core_java_topics.keywords.staticKeyword.withVariable;

public class BOAFPremiumRewardsCard {

	long cust_id;
	long cc_number;
	String rc_cust_holder_name;
	double cc_limit;
	int cv_num;
	static String BANK_NAME = "Bank Of America";
	
	public BOAFPremiumRewardsCard(long cust_id, long cc_number, String rc_cust_holder_name, double cc_limit,
			int cv_num) {
		super();
		this.cust_id = cust_id;
		this.cc_number = cc_number;
		this.rc_cust_holder_name = rc_cust_holder_name;
		this.cc_limit = cc_limit;
		this.cv_num = cv_num;
	}
	public void displayCCInfo() {
		System.out.println("============= Credit Card Details ==================");
		System.out.println("Cust Id : " + cust_id);
		System.out.println("CC Number : " + cc_number);
		System.out.println("Card Holder Name : " + rc_cust_holder_name);
		System.out.println("Cc Limit : " + cc_limit);
		System.out.println("Cvv Number : " + cv_num);
		System.out.println("Bank Name : " + BANK_NAME);
	}
	public static void main(String[] args) {
		BOAFPremiumRewardsCard card1 = new BOAFPremiumRewardsCard(12345l,56465467476l,"Mohammed Kamran", 70000.0d, 765);
		BOAFPremiumRewardsCard card2 = new BOAFPremiumRewardsCard(12347l,56465467523l,"Mohammed Farhan", 80000.0d, 342);
		card1.displayCCInfo();
		card2.displayCCInfo();
	}
}
