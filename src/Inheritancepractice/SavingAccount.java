package Inheritancepractice;

public class SavingAccount {

	private long accnum;
	private String bank_name;
	private Address address;
	
	
	public SavingAccount(long accnum, String bank_name, Address address) {
		super();
		this.accnum = accnum;
		this.bank_name = bank_name;
		this.address = address;
	}
	public long getAccnum() {
		return accnum;
	}
	public void setAccnum(long accnum) {
		this.accnum = accnum;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "SavingAccount [accnum=" + accnum + ", bank_name=" + bank_name + ", address=" + address + "]";
	}
}
