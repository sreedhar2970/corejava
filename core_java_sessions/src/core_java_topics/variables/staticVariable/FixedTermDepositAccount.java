package core_java_topics.variables.staticVariable;

public class FixedTermDepositAccount {

	private long fda_account_num;
	private String fda_acc_holder_name;
	private double roi;
	private int tenure;
	private double fd_amount;
	public static String BANK_NAME = "HDFC Bank";
	
	public long getFda_account_num() {
		return fda_account_num;
	}
	public void setFda_account_num(long fda_account_num) {
		this.fda_account_num = fda_account_num;
	}
	public String getFda_acc_holder_name() {
		return fda_acc_holder_name;
	}
	public void setFda_acc_holder_name(String fda_acc_holder_name) {
		this.fda_acc_holder_name = fda_acc_holder_name;
	}
	public double getRoi() {
		return roi;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getFd_amount() {
		return fd_amount;
	}
	public void setFd_amount(double fd_amount) {
		this.fd_amount = fd_amount;
	}
	
	
}
