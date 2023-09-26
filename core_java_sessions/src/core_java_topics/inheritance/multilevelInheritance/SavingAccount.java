package core_java_topics.inheritance.multilevelInheritance;

public class SavingAccount extends BankAccount{

	private double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void displaySAAccountInfo() {
		super.displayBankAccInfo();
		System.out.println("Rate Of Interest : " + interestRate);
	}
}
