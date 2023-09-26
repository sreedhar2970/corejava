package core_java_topics.objectCreation.usingCloneMethod;

public class BusinessAdvantageRelationshipAccount implements Cloneable{

	private long baa_acc_num;
	private String baa_customer_name;
	private double business_loan_amount;
	private double roi;
	private int tenure;
	private String branch;
	private String city;
	private String state;
	
	public long getBaa_acc_num() {
		return baa_acc_num;
	}
	public void setBaa_acc_num(long baa_acc_num) {
		this.baa_acc_num = baa_acc_num;
	}
	public String getBaa_customer_name() {
		return baa_customer_name;
	}
	public void setBaa_customer_name(String baa_customer_name) {
		this.baa_customer_name = baa_customer_name;
	}
	public double getBusiness_loan_amount() {
		return business_loan_amount;
	}
	public void setBusiness_loan_amount(double business_loan_amount) {
		this.business_loan_amount = business_loan_amount;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
