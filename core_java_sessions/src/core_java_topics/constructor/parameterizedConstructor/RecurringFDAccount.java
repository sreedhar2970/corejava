package core_java_topics.constructor.parameterizedConstructor;

public class RecurringFDAccount {

	private long rfd_acc_num;
	private String rfd_cust_name;
	private String ifsc_code;
	private double rfd_acc_balance;
	
	// this is a no-arg constructor
	public RecurringFDAccount() {}
	// this is a parameterized constructor
	public RecurringFDAccount(long rfd_acc_num, String rfd_cust_name, String ifsc_code, double rfd_acc_balance) {
		super();
		this.rfd_acc_num = rfd_acc_num;
		this.rfd_cust_name = rfd_cust_name;
		this.ifsc_code = ifsc_code;
		this.rfd_acc_balance = rfd_acc_balance;
	}

	public static void main(String[] args) {
		RecurringFDAccount account = new RecurringFDAccount();
		System.out.println("Account Number : " + account.rfd_acc_num);
		System.out.println("Customer Name : " + account.rfd_cust_name);
		System.out.println("Ifsc Code : " + account.ifsc_code);
		System.out.println("Account Balance : " + account.rfd_acc_balance);
		
	}

}
