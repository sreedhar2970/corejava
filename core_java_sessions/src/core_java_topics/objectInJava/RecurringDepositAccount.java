package core_java_topics.objectInJava;

public class RecurringDepositAccount {

	long rda_acc_number;
	String rda_acc_holder_name;
	String rda_branch_name;
	String ifsc_code;
	double rda_acc_balance;
	
	public static void main(String[] args) {
		// class_name object_name = new class_name();
		//In this example We have only created the object but not initialized
		RecurringDepositAccount account = new RecurringDepositAccount();
		System.out.println("Account Number : " + account.rda_acc_number);
		System.out.println("Account Holder Name : " + account.rda_acc_holder_name);
		System.out.println("Branch Name: " + account.rda_branch_name);
		System.out.println("Ifsc Code : " + account.ifsc_code);
		System.out.println("Account balance : " + account.rda_acc_balance);
	}
}
