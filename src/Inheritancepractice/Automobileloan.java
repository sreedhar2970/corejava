package Inheritancepractice;

public class Automobileloan {
	
	private double amount;
	private int tenure;
	private long accnum;
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public long getAccnum() {
		return accnum;
	}
	public void setAccnum(long accnum) {
		this.accnum = accnum;
	}
	@Override
	public String toString() {
		return "Automobileloan [amount=" + amount + ", tenure=" + tenure + ", accnum=" + accnum + "]";
	}
	

}
