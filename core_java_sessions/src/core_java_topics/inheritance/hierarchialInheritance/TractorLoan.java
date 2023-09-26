package core_java_topics.inheritance.hierarchialInheritance;

public class TractorLoan extends Loan{

	private double processing_fee;
	private int minimum_tenure;
	
	public double getProcessing_fee() {
		return processing_fee;
	}
	public void setProcessing_fee(double processing_fee) {
		this.processing_fee = processing_fee;
	}
	public int getMinimum_tenure() {
		return minimum_tenure;
	}
	public void setMinimum_tenure(int minimum_tenure) {
		this.minimum_tenure = minimum_tenure;
	}
}
