package core_java_topics.constructor.parameterizedConstructor;

public class FixedTermCDAccount {

	private long fta_acc_num;
	private String fta_cust_name;
	private String branch_name;
	private long ssn_num;
	private String mailing_address;
	private String landmark1;
	private String address_line1;
	private String address_line2;
	private String city;
	private String state;
	private int fta_tenure;
	private double roi;
	private double fta_fd_amount;
	
	public FixedTermCDAccount(){}
	public FixedTermCDAccount(long fta_acc_num, String fta_cust_name, String branch_name, long ssn_num,
			String mailing_address, String landmark1, String address_line1, String address_line2, String city,
			String state, int fta_tenure, double roi, double fta_fd_amount) {
		super();
		this.fta_acc_num = fta_acc_num;
		this.fta_cust_name = fta_cust_name;
		this.branch_name = branch_name;
		this.ssn_num = ssn_num;
		this.mailing_address = mailing_address;
		this.landmark1 = landmark1;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.city = city;
		this.state = state;
		this.fta_tenure = fta_tenure;
		this.roi = roi;
		this.fta_fd_amount = fta_fd_amount;
	}
	
	public void displayFTADetails() {
		
		System.out.println("============ Account Deatils ===============");
		System.out.println("Account number : " + fta_acc_num);
		System.out.println("Customer Name : " + fta_cust_name);
		System.out.println("Branch Name : " + branch_name);
		System.out.println("Social Security Number : " + ssn_num);
		System.out.println("Mailing Address : " + mailing_address);
		System.out.println("Land Mark : " + landmark1);
		System.out.println("Address Line1 : " + address_line1);
		System.out.println("Address Line2 : " + address_line2);
		System.out.println("City : " + city);
		System.out.println("State : " + state);
		System.out.println("Tenure : " + fta_tenure);
		System.out.println("Rate Of interest : " + roi);
		System.out.println("FD Amount : " + fta_fd_amount);
		
	}
	
	public void getCreditCardDetails() {
		System.out.println("4356578578689");
		System.out.println("Mohammed Kamran");
		System.out.println("5674");
		System.out.println("453");
		System.out.println("40000");
	}
}