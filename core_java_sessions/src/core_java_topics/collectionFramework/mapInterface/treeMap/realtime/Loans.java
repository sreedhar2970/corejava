package core_java_topics.collectionFramework.mapInterface.treeMap.realtime;

public class Loans {

	long loan_id;
	String loan_type;
	String loan_acc_holder_name;
	double loan_amount;
	double rate_of_interest;
	public Loans(long loan_id, String loan_type, String loan_acc_holder_name, double loan_amount,
			double rate_of_interest) {
		super();
		this.loan_id = loan_id;
		this.loan_type = loan_type;
		this.loan_acc_holder_name = loan_acc_holder_name;
		this.loan_amount = loan_amount;
		this.rate_of_interest = rate_of_interest;
	}
	@Override
	public String toString() {
		return "Loans [loan_id=" + loan_id + ", loan_type=" + loan_type + ", loan_acc_holder_name="
				+ loan_acc_holder_name + ", loan_amount=" + loan_amount + ", rate_of_interest=" + rate_of_interest
				+ "]";
	}
	
}
