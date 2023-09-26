package core_java_topics.classandObject.classExm;
public class SavingAccountDetails {

	public static void main(String[] args) {
		// syntax to create object
		// using new keyword we can create the object
		// class_name object_name = new class_name();
		SavingAccount account1 = new SavingAccount();
		SavingAccount account2 = new SavingAccount();
		
		account1.setSa_acc_num(123456789l);
		account1.setSa_acc_holder_name("Manoj");
		account1.setBranch_name("Bangalore Branch");
		account1.setIfsc_code(1234);
		account1.setSa_acc_balance(50000.0d);
		
		account2.setSa_acc_num(89756756757l);
		account2.setSa_acc_holder_name("Mohan");
		account2.setBranch_name("Hyderabad Branch");
		account2.setIfsc_code(7564);
		account2.setSa_acc_balance(60000.0d);
		
		System.out.println("=================== Account 1 Details ===================");
		System.out.println("Account Number : " + account1.getSa_acc_num());
		System.out.println("Account Holder Name : " + account1.getSa_acc_holder_name());
		System.out.println("Branch Name : " + account1.getBranch_name());
		System.out.println("Ifsc Code : " + account1.getIfsc_code());
		System.out.println("Account Balance : " + account1.getSa_acc_balance());
		System.out.println("=================== Account 2 Details ===================");
		System.out.println("Account Number : " + account2.getSa_acc_num());
		System.out.println("Account Holder Name : " + account2.getSa_acc_holder_name());
		System.out.println("Branch Name : " + account2.getBranch_name());
		System.out.println("Ifsc Code : " + account2.getIfsc_code());
		System.out.println("Account Balance : " + account2.getSa_acc_balance());
	}
}
