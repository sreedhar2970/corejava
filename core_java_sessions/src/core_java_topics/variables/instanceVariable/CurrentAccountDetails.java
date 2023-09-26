package core_java_topics.variables.instanceVariable;

public class CurrentAccountDetails {

	public static void main(String[] args) {

		// using new keyword we can create object of a class
		// syntax to create an object
		// class_name object_name = new class_name();
		CurrentAccount account1 = new CurrentAccount();
		CurrentAccount account2 = new CurrentAccount();
		CurrentAccount account3 = new CurrentAccount();
		
		account1.setCa_acc_number(123456789l);
		account1.setCa_holder_name("Ramesh");
		account1.setCa_branch_name("Bangalore Branch");
		account1.setCa_acc_balance(50000.0d);
		
		account2.setCa_acc_number(123456780l);
		account2.setCa_holder_name("Roshini");
		account2.setCa_branch_name("Pune Branch");
		account2.setCa_acc_balance(60000.0d);
		
		account3.setCa_acc_number(123456788l);
		account3.setCa_holder_name("Subrat");
		account3.setCa_branch_name("Odisha Branch");
		account3.setCa_acc_balance(70000.0d);
		
		System.out.println("================== Account 1 Details ====================");
		System.out.println("Account Number : " + account1.getCa_acc_number());
		System.out.println("Customer Name : " + account1.getCa_holder_name());
		System.out.println("Branch Name : " + account1.getCa_branch_name());
		System.out.println("Available Balance : " + account1.getCa_acc_balance());
		System.out.println("================== Account 2 Details ====================");
		System.out.println("Account Number : " + account2.getCa_acc_number());
		System.out.println("Customer Name : " + account2.getCa_holder_name());
		System.out.println("Branch Name : " + account2.getCa_branch_name());
		System.out.println("Available Balance : " + account2.getCa_acc_balance());
		System.out.println("================== Account 3 Details ====================");
		System.out.println("Account Number : " + account3.getCa_acc_number());
		System.out.println("Customer Name : " + account3.getCa_holder_name());
		System.out.println("Branch Name : " + account3.getCa_branch_name());
		System.out.println("Available Balance : " + account3.getCa_acc_balance());
		
	}

}
