package core_java_topics.copyingValueOfAnObject.usingConstructor;

// this program is to initialize the values of one object to another object using constructor 
public class SafeBalanceAccount {

	private long cust_id;
	private long sba_acc_num;
	private String sba_cust_name;
	private double sba_acc_balance;
	// this is a parameterized constructor to initialize the object
	public SafeBalanceAccount(long cust_id, long sba_acc_num, String sba_cust_name, double sba_acc_balance) {
		super();
		this.cust_id = cust_id;
		this.sba_acc_num = sba_acc_num;
		this.sba_cust_name = sba_cust_name;
		this.sba_acc_balance = sba_acc_balance;
	}
	// it is used to copy the values of one object to another object
	public SafeBalanceAccount(SafeBalanceAccount sbaObject) {
		cust_id = sbaObject.cust_id;
		sba_acc_num = sbaObject.sba_acc_num;
		sba_cust_name = sbaObject.sba_cust_name;
		sba_acc_balance = sbaObject.sba_acc_balance;
	}
//	
	public void displayInfo() {
		System.out.println("Cust id : " + cust_id + " Account Number : " + sba_acc_num + " Customer Name : " 
						+ sba_cust_name + " Balance : " + sba_acc_balance);
	}
	public static void main(String[] args) {
		SafeBalanceAccount account1 = new SafeBalanceAccount(12345l,22222222222l,"Kamran",5000.0d);
		SafeBalanceAccount account2 = new SafeBalanceAccount(account1);
		account1.displayInfo();
		account2.displayInfo();
	}
}
