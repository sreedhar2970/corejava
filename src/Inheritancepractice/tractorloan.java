package Inheritancepractice;

public class tractorloan {
	
	private int tenure;
	private long accnum;
	private double amount;
	
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "tractorloan [tenure=" + tenure + ", accnum=" + accnum + ", amount=" + amount + "]";
	}

}
