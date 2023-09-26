package core_java_topics.inheritance.multilevelInheritance;

public class BankAccount extends Asset{

	private long acc_number;
	private String bank_name;
	private double balance;
	
	public long getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(long acc_number) {
		this.acc_number = acc_number;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void displayBankAccInfo() {
		super.displayAsset();
		System.out.println("Account Number : " + acc_number);
		System.out.println("Bank Name : " + bank_name);
		System.out.println("Available Balance : " + balance);
	}
}
