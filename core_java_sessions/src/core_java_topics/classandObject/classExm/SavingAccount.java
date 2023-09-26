package core_java_topics.classandObject.classExm;

// public is an access modifier
// class is keyowrd to declare a class in java
// SavingAccount - is the class-name
public class SavingAccount {

	// declare variables
	private long sa_acc_num;
	private String sa_acc_holder_name;
	private String branch_name;
	private int ifsc_code;
	private double sa_acc_balance;

	// declare setter and getter methods
	// setter methods are used to set the values for the variables/object
	// getter methods are used to get the values
	
	public long getSa_acc_num() {
		return sa_acc_num;
	}
	public void setSa_acc_num(long sa_acc_num) {
		this.sa_acc_num = sa_acc_num;
	}
	public String getSa_acc_holder_name() {
		return sa_acc_holder_name;
	}
	public void setSa_acc_holder_name(String sa_acc_holder_name) {
		this.sa_acc_holder_name = sa_acc_holder_name;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public int getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(int ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public double getSa_acc_balance() {
		return sa_acc_balance;
	}
	public void setSa_acc_balance(double sa_acc_balance) {
		this.sa_acc_balance = sa_acc_balance;
	}
	
}
