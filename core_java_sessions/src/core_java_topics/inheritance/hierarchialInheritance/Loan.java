package core_java_topics.inheritance.hierarchialInheritance;

public class Loan {

	private long loan_num;
	private String loan_applicant;
	private String disbusred_date;
	private double loan_amount;
	private double loan_emi;
	
	public long getLoan_num() {
		return loan_num;
	}
	public void setLoan_num(long loan_num) {
		this.loan_num = loan_num;
	}
	public String getLoan_applicant() {
		return loan_applicant;
	}
	public void setLoan_applicant(String loan_applicant) {
		this.loan_applicant = loan_applicant;
	}
	public String getDisbusred_date() {
		return disbusred_date;
	}
	public void setDisbusred_date(String disbusred_date) {
		this.disbusred_date = disbusred_date;
	}
	public double getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(double loan_amount) {
		this.loan_amount = loan_amount;
	}
	public double getLoan_emi() {
		return loan_emi;
	}
	public void setLoan_emi(double loan_emi) {
		this.loan_emi = loan_emi;
	}

}
