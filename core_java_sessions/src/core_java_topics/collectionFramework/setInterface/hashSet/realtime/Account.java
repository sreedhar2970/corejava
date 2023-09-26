package core_java_topics.collectionFramework.setInterface.hashSet.realtime;

import java.util.Objects;

public class Account {

	long acc_num;
	String acc_holder_name;
	String ifsc_code;
	String branch_name;
	double acc_balance;
	
	public Account(long acc_num, String acc_holder_name, String ifsc_code, String branch_name, double acc_balance) {
		super();
		this.acc_num = acc_num;
		this.acc_holder_name = acc_holder_name;
		this.ifsc_code = ifsc_code;
		this.branch_name = branch_name;
		this.acc_balance = acc_balance;
	}

	@Override
	public String toString() {
		return "Account [acc_num=" + acc_num + ", acc_holder_name=" + acc_holder_name + ", ifsc_code=" + ifsc_code
				+ ", branch_name=" + branch_name + ", acc_balance=" + acc_balance + "]";
	}
}
