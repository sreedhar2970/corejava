package core_java_topics.inheritance.problem;

public class AutomobileLoan {

	private long loan_number;
	private String loan_applicant_name;
	private String loan_disbursed_date;
	private String mailing_address;
	private double loan_amount;
	private double roi_interest;
	
	public long getLoan_number() {
		return loan_number;
	}
	public void setLoan_number(long loan_number) {
		this.loan_number = loan_number;
	}
	public String getLoan_applicant_name() {
		return loan_applicant_name;
	}
	public void setLoan_applicant_name(String loan_applicant_name) {
		this.loan_applicant_name = loan_applicant_name;
	}
	public String getLoan_disbursed_date() {
		return loan_disbursed_date;
	}
	public void setLoan_disbursed_date(String loan_disbursed_date) {
		this.loan_disbursed_date = loan_disbursed_date;
	}
	public String getMailing_address() {
		return mailing_address;
	}
	public void setMailing_address(String mailing_address) {
		this.mailing_address = mailing_address;
	}
	public double getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(double loan_amount) {
		this.loan_amount = loan_amount;
	}
	public double getRoi_interest() {
		return roi_interest;
	}
	public void setRoi_interest(double roi_interest) {
		this.roi_interest = roi_interest;
	}
	@Override
	public String toString() {
		return "AutomobileLoan [loan_number=" + loan_number + ", loan_applicant_name=" + loan_applicant_name
				+ ", loan_disbursed_date=" + loan_disbursed_date + ", mailing_address=" + mailing_address
				+ ", loan_amount=" + loan_amount + ", roi_interest=" + roi_interest + "]";
	}
}
