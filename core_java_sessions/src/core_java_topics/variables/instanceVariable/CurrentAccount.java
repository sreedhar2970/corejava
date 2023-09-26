package core_java_topics.variables.instanceVariable;

public class CurrentAccount {

	//declaring instance variable
	private long ca_acc_number;
	private String ca_holder_name;
	private String ca_branch_name;
	private double ca_acc_balance;
	
	public long getCa_acc_number() {
		return ca_acc_number;
	}
	public void setCa_acc_number(long ca_acc_number) {
		this.ca_acc_number = ca_acc_number;
	}
	public String getCa_holder_name() {
		return ca_holder_name;
	}
	public void setCa_holder_name(String ca_holder_name) {
		this.ca_holder_name = ca_holder_name;
	}
	public String getCa_branch_name() {
		return ca_branch_name;
	}
	public void setCa_branch_name(String ca_branch_name) {
		this.ca_branch_name = ca_branch_name;
	}
	public double getCa_acc_balance() {
		return ca_acc_balance;
	}
	public void setCa_acc_balance(double ca_acc_balance) {
		this.ca_acc_balance = ca_acc_balance;
	}
	
}
