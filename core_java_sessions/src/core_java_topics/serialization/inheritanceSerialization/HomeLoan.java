package core_java_topics.serialization.inheritanceSerialization;

import java.io.Serializable;

public class HomeLoan extends Loan {

	private static final long serialVersionUID = 1L;
	private long loan_number;
	private String cust_name;
	private String address_line1;
	private String address_line2;
	private double loan_amount;
	private double rate_of_interest;
	
	public HomeLoan(long loan_id, String loan_type, String bank_name, long loan_number, String cust_name,
			String address_line1, String address_line2, double loan_amount, double rate_of_interest) {
		super(loan_id, loan_type, bank_name);
		this.loan_number = loan_number;
		this.cust_name = cust_name;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.loan_amount = loan_amount;
		this.rate_of_interest = rate_of_interest;
	}

	public long getLoan_number() {
		return loan_number;
	}

	public void setLoan_number(long loan_number) {
		this.loan_number = loan_number;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	public double getLoan_amount() {
		return loan_amount;
	}

	public void setLoan_amount(double loan_amount) {
		this.loan_amount = loan_amount;
	}

	public double getRate_of_interest() {
		return rate_of_interest;
	}

	public void setRate_of_interest(double rate_of_interest) {
		this.rate_of_interest = rate_of_interest;
	}
	
	
}
