package core_java_topics.collectionFramework.comparatorInterface;

public class SavingAccount {

	long acc_num;
	String acc_holder_name;
	String branch_name;
	double acc_balance;
	
	public SavingAccount(long acc_num, String acc_holder_name, String branch_name, double acc_balance) {
		super();
		this.acc_num = acc_num;
		this.acc_holder_name = acc_holder_name;
		this.branch_name = branch_name;
		this.acc_balance = acc_balance;
	}

	@Override
	public String toString() {
		return "SavingAccount [acc_num=" + acc_num + ", acc_holder_name=" + acc_holder_name + ", branch_name="
				+ branch_name + ", acc_balance=" + acc_balance + "]";
	}
}
