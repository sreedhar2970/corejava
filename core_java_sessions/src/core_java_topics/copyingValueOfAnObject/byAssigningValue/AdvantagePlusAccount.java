package core_java_topics.copyingValueOfAnObject.byAssigningValue;

public class AdvantagePlusAccount {

	long cust_id;
	long acc_number;
	String cust_name;
	String branch_name;
	String city;
	double balance;
	
	public AdvantagePlusAccount() {}
	public AdvantagePlusAccount(long cust_id, long acc_number, String cust_name, String branch_name, String city,
			double balance) {
		super();
		this.cust_id = cust_id;
		this.acc_number = acc_number;
		this.cust_name = cust_name;
		this.branch_name = branch_name;
		this.city = city;
		this.balance = balance;
	}
	
	public void displayAccInfo() {
		System.out.println("Customer Id : " + cust_id);
		System.out.println("Account Number : " + acc_number);
		System.out.println("Customer Name : " + cust_name);
		System.out.println("Branch Name : " + branch_name);
		System.out.println("City : " + city);
		System.out.println("Available Balance : " + balance);
	}
	
	public static void main(String[] args) {
		AdvantagePlusAccount account1 = new AdvantagePlusAccount(1234l,123456789l, "Manoj","Bangalore Branch","Bangalore City",100000.0d);
		AdvantagePlusAccount account2 = new AdvantagePlusAccount();
		account2.cust_id = account1.cust_id;
		account2.acc_number = account1.acc_number;
		account2.cust_name = account1.cust_name;
		account2.branch_name = account1.branch_name;
		account2.city = account1.city;
		account2.balance = account1.balance;
		
		account1.displayAccInfo();
		System.out.println("================ Values from account1 object are copied to account2 object ================");
		account2.displayAccInfo();
		
	}
}
