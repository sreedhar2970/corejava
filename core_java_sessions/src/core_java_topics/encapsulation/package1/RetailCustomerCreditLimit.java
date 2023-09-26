package core_java_topics.encapsulation.package1;

public class RetailCustomerCreditLimit {

	protected long cust_sr_num = 123456789l;
	protected int limit_grp_indicator = 5654;
	protected String limit_type = " Credit Type";
	protected double limit_amount = 100000.0d;
	protected String start_date = "12-05-2023";
	protected String cust_name = "Mohammed Zeeshan";
	
	protected void displayCreditLmtInfo() {
		System.out.println("Serial Number : " + cust_sr_num);
		System.out.println("Limit Group Indicator : " + limit_grp_indicator);
		System.out.println("Limit Type : " + limit_type);
		System.out.println("Limit Amount : " + limit_amount);
		System.out.println("Start Date : " + start_date);
		System.out.println("Customer Name : " + cust_name);
	}
	
	public static void main(String[] args) {
		
		RetailCustomerCreditLimit limit = new RetailCustomerCreditLimit();
		limit.displayCreditLmtInfo();
	}
}
