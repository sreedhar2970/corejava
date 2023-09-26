package core_java_topics.inheritance.aggregation;
public class SavingAccount {

	private long acc_num;
	private String branch;
	private String name;
	private double available_balance;
	// this is aggregation - whenever a class having another class entity reference 
	private ProfileDetails profileDetails; 
	
	public SavingAccount(long acc_num, String branch, String name, double available_balance,
			ProfileDetails profileDetails) {
		super();
		this.acc_num = acc_num;
		this.branch = branch;
		this.name = name;
		this.available_balance = available_balance;
		this.profileDetails = profileDetails;
	}
	
	public void displayProfileDetails() {
		System.out.println("============== Account Details ================");
		System.out.println("Account Number : " + acc_num);
		System.out.println("Branch : " + branch);
		System.out.println("Name : " + name);
		System.out.println("Available Balance : " + available_balance);
		System.out.println("============== Profile Details ===============");
		System.out.println("Customer Name : " + profileDetails.getCust_name());
		System.out.println("Address : " + profileDetails.getAddress());
		System.out.println("City : " + profileDetails.getCity());
		System.out.println("State  : " + profileDetails.getState());
		System.out.println("Zip Code : " + profileDetails.getZipCode());
		System.out.println("Pan Card : " + profileDetails.getPanCard());
	}
}
