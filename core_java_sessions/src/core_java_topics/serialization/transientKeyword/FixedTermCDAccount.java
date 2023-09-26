package core_java_topics.serialization.transientKeyword;

import java.io.Serializable;

public class FixedTermCDAccount implements Serializable{

	private static final long serialVersionUID = 1L;
	private long fta_acc_num;
	private String fta_cust_name;
	private String branch_name;
	private transient long ssn_num;
	private String mailing_address;
	private String landmark1;
	private String address_line1;
	private String address_line2;
	private transient String city;
	private String state;
	private int fta_tenure;
	private double roi;
	private double fta_fd_amount;
	
	public FixedTermCDAccount(){}
	public FixedTermCDAccount(long fta_acc_num, String fta_cust_name, String branch_name, long ssn_num,
			String mailing_address, String landmark1, String address_line1, String address_line2, String city,
			String state, int fta_tenure, double roi, double fta_fd_amount) {
		super();
		this.fta_acc_num = fta_acc_num;
		this.fta_cust_name = fta_cust_name;
		this.branch_name = branch_name;
		this.ssn_num = ssn_num;
		this.mailing_address = mailing_address;
		this.landmark1 = landmark1;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.city = city;
		this.state = state;
		this.fta_tenure = fta_tenure;
		this.roi = roi;
		this.fta_fd_amount = fta_fd_amount;
	}
	@Override
	public String toString() {
		return "FixedTermCDAccount [fta_acc_num=" + fta_acc_num + ", fta_cust_name=" + fta_cust_name + ", branch_name="
				+ branch_name + ", mailing_address=" + mailing_address + ", landmark1=" + landmark1 + ", address_line1="
				+ address_line1 + ", address_line2=" + address_line2 + ", state=" + state + ", fta_tenure=" + fta_tenure
				+ ", roi=" + roi + ", fta_fd_amount=" + fta_fd_amount + "]";
	}
	
	
}