package core_java_topics.encapsulation.package1;

public class WholeSaleGTRFAccount {

	private long gtrf_acc_number = 56465465l;
	private String branch = "Raichur Branch";
	private String acc_holder_name = "Mohammed Kamran";
	private String city = "Raichur";
	private String state = "Karnataka";
	private double acc_balance = 50000.0d;
	
	protected void displayGTRFAccInfo() {
		System.out.println("Account Number : " + gtrf_acc_number);
		System.out.println("Account Branch : " + branch);
		System.out.println("Customer Name : " + acc_holder_name);
		System.out.println("City : " + city);
		System.out.println("State : " + state);
		System.out.println("Avaialable Balance : " + acc_balance);
	}
	public static void main(String[] args) {
		
		WholeSaleGTRFAccount account = new WholeSaleGTRFAccount();
		account.displayGTRFAccInfo();
		
	}
}
