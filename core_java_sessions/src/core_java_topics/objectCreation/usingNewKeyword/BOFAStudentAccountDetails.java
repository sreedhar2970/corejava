package core_java_topics.objectCreation.usingNewKeyword;

public class BOFAStudentAccountDetails {

	public static void main(String[] args) {

		// using new keyword we have created the object
		BOFAStudentAccount account1 = new BOFAStudentAccount();
		BOFAStudentAccount account2 = new BOFAStudentAccount();
		
		account1.setStd_acc_num(123456789l);
		account1.setStd_holder_name("Ramesh");
		account1.setBranch_name("Hyderabad Branch");
		account1.setStd_acc_balance(7000.0d);
		account1.setMinimum_opening_balance(2000.0d);
		
		account2.setStd_acc_num(123456788l);
		account2.setStd_holder_name("Manoj");
		account2.setBranch_name("Bangalore Branch");
		account2.setStd_acc_balance(8000.0d);
		account2.setMinimum_opening_balance(3000.0d);
		
		System.out.println("============== Account 1 Details ==============");
		System.out.println("Account Number : " + account1.getStd_acc_num());
		System.out.println("Student Name: " + account1.getStd_holder_name());
		System.out.println("Branch Name : " + account1.getBranch_name());
		System.out.println("Account Balance : " + account1.getStd_acc_balance());
		System.out.println("Minimum Balance : " + account1.getMinimum_opening_balance());
		
		System.out.println("============== Account 2 Details ==============");
		System.out.println("Account Number : " + account2.getStd_acc_num());
		System.out.println("Student Name: " + account2.getStd_holder_name());
		System.out.println("Branch Name : " + account2.getBranch_name());
		System.out.println("Account Balance : " + account2.getStd_acc_balance());
		System.out.println("Minimum Balance : " + account2.getMinimum_opening_balance());
	}

}
