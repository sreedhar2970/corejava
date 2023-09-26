package core_java_topics.objectInJava.usingMethod;

public class BusinessAdvantageplusAccount {

	long bapa_acc_num;
	String bapa_acc_holder_name;
	String branch_name;
	String ifsc_code;
	double bapa_acc_balance;
	
	
	public void insertAccountDeatils(long bapa_acc_num,String bapa_acc_holder_name,String branch_name,String ifsc_code,double bapa_acc_balance) {
		this.bapa_acc_num = bapa_acc_num;
		this.bapa_acc_holder_name = bapa_acc_holder_name;
		this.branch_name = branch_name;
		this.ifsc_code = ifsc_code;
		this.bapa_acc_balance = bapa_acc_balance;
	}
	public void displayAccountDetails() {
		System.out.println("========== Account Details ===============");
		System.out.println("Account Number : " + bapa_acc_num);
		System.out.println("Customer Name : " + bapa_acc_holder_name);
		System.out.println("Branch Name : " + branch_name);
		System.out.println("Ifsc Code : " + ifsc_code);
		System.out.println("Account Balance : " + bapa_acc_balance);
		
	}
}
