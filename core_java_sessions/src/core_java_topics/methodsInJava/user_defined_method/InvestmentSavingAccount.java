package core_java_topics.methodsInJava.user_defined_method;

public class InvestmentSavingAccount {

	private long isa_acc_num;
	private String isa_customer_name;
	private String branch_name;
	private String ifsc_code;
	private double isa_acc_balance;
	
	public long getIsa_acc_num() {
		return isa_acc_num;
	}
	public void setIsa_acc_num(long isa_acc_num) {
		this.isa_acc_num = isa_acc_num;
	}
	public String getIsa_customer_name() {
		return isa_customer_name;
	}
	public void setIsa_customer_name(String isa_customer_name) {
		this.isa_customer_name = isa_customer_name;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public double getIsa_acc_balance() {
		return isa_acc_balance;
	}
	public void setIsa_acc_balance(double isa_acc_balance) {
		this.isa_acc_balance = isa_acc_balance;
	}

	// user-defined method to change pin number
	public void changePin(int pinNumber) {
		if(pinNumber==1234) {
			System.out.println("Your pin number is  : 5674");
		}else {
			System.out.println("You entered wrong pin number - Please check your pin  number");
		}
	}
	// user defined method to generate mini statement of the account
	public void generateStatement(long isa_acc_num) {
		System.out.println("2000 debited on 12-04-2023");
		System.out.println("6000 credited on 16-04-2023");
		System.out.println("100 debited on 19-04-2023");
		System.out.println("5600 credited on 21-09-2023");
	}
}