package core_java_topics.serialization;

import java.io.Serializable;

public class AccountStatement implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long cust_id;
	private long account_number;
	private String account_branch;
	private String account_type;
	private String cust_name;
	private String city;
	private String state;
	private long phone_number;
	private long odl_limit;
	private String currency;
	private String account_status;
	private int branch_code;
	private double closing_balance;
	
	public AccountStatement(long cust_id, long account_number, String account_branch, String account_type,
			String cust_name, String city, String state, long phone_number, long odl_limit, String currency,
			String account_status, int branch_code, double closing_balance) {
		super();
		this.cust_id = cust_id;
		this.account_number = account_number;
		this.account_branch = account_branch;
		this.account_type = account_type;
		this.cust_name = cust_name;
		this.city = city;
		this.state = state;
		this.phone_number = phone_number;
		this.odl_limit = odl_limit;
		this.currency = currency;
		this.account_status = account_status;
		this.branch_code = branch_code;
		this.closing_balance = closing_balance;
	}

	public long getCust_id() {
		return cust_id;
	}

	public void setCust_id(long cust_id) {
		this.cust_id = cust_id;
	}

	public long getAccount_number() {
		return account_number;
	}

	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}

	public String getAccount_branch() {
		return account_branch;
	}

	public void setAccount_branch(String account_branch) {
		this.account_branch = account_branch;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
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

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public long getOdl_limit() {
		return odl_limit;
	}

	public void setOdl_limit(long odl_limit) {
		this.odl_limit = odl_limit;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAccount_status() {
		return account_status;
	}

	public void setAccount_status(String account_status) {
		this.account_status = account_status;
	}

	public int getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(int branch_code) {
		this.branch_code = branch_code;
	}

	public double getClosing_balance() {
		return closing_balance;
	}

	public void setClosing_balance(double closing_balance) {
		this.closing_balance = closing_balance;
	}

}
