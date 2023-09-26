package core_java_topics.variables.localVariable;

public class CertificateOfDepositAccount {

	private long cda_acc_num;
	private String cda_holder_name;
	private String branch_name;
	private long ssn_number;
	private double cda_acc_balance = 5000.0d;
	
	public long getCda_acc_num() {
		return cda_acc_num;
	}
	public void setCda_acc_num(long cda_acc_num) {
		this.cda_acc_num = cda_acc_num;
	}
	public String getCda_holder_name() {
		return cda_holder_name;
	}
	public void setCda_holder_name(String cda_holder_name) {
		this.cda_holder_name = cda_holder_name;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public long getSsn_number() {
		return ssn_number;
	}
	public void setSsn_number(long ssn_number) {
		this.ssn_number = ssn_number;
	}
	
	public void depositAmount(double dptAmt) {
		double afterDeposit = cda_acc_balance + dptAmt;
		System.out.println("After Deposit : " + afterDeposit);
	}
	
	public void withdrawAmount(double wthAmt) {
		double afterWithdraw = cda_acc_balance - wthAmt;
		System.out.println("After Withdraw : " + afterWithdraw);
	}
	
}
