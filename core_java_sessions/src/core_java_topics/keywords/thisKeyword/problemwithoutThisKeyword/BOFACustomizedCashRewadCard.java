package core_java_topics.keywords.thisKeyword.problemwithoutThisKeyword;

public class BOFACustomizedCashRewadCard {

	long cc_num;
	String cc_holder_name;
	String expiry_date;
	double credit_limit;
	int pinNumber;
	int cvv_num;
	
	public BOFACustomizedCashRewadCard(long cc_num, String cc_holder_name, String expiry_date, double credit_limit,
			int pinNumber, int cvv_num) {
		super();
		cc_num = cc_num;
		cc_holder_name = cc_holder_name;
		expiry_date = expiry_date;
		credit_limit = credit_limit;
		pinNumber = pinNumber;
		cvv_num = cvv_num;
	}
	
	public void displayCCDetails() {
		System.out.println("================ Credit Card Details =================");
		System.out.println("Credit Card Number : " + cc_num);
		System.out.println("Customer Name : " + cc_holder_name);
		System.out.println("Expiry Date : " + expiry_date);
		System.out.println("Credit Limit : " + credit_limit);
		System.out.println("Pin Number : " + pinNumber);
		System.out.println("Cvv Number : " + cvv_num);
	}
	
}
