package core_java_topics.objectInJava.usingReferenceVariable;

public class TaxSavingFDAccount {

	long tfd_acc_num;
	String tfd_acc_holder_name;
	String ifsc_code;
	String branch_name;
	String city;
	String state;
	double tfd_amount;
	int tdf_tenure;
	
	public static void main(String[] args) {
		
		TaxSavingFDAccount account1 = new TaxSavingFDAccount();
		TaxSavingFDAccount account2 = new TaxSavingFDAccount();
		
		
		account1.tfd_acc_num = 123456789l;
		account1.tfd_acc_holder_name = "Anil";
		account1.ifsc_code = "BNG465HJ";
		account1.branch_name = "Bangalore Branch";
		account1.city = "Bangalore";
		account1.state = "Karnataka";
		account1.tfd_amount = 100000.0d;
		account1.tdf_tenure = 5;
		
		account2.tfd_acc_num = 123456788l;
		account2.tfd_acc_holder_name = "Manoj";
		account2.ifsc_code = "HYD58775KH";
		account2.branch_name = "Hydeaabad Branch";
		account2.city = "Hyderabad";
		account2.state = "Telegana";
		account2.tfd_amount = 150000.0d;
		account2.tdf_tenure = 10;
		
		System.out.println("============== Account 1 Details ======================");
		System.out.println("Account Number : " + account1.tfd_acc_num);
		System.out.println("Customer Name : " + account1.tfd_acc_holder_name);
		System.out.println("Ifsc Code : " + account1.ifsc_code);
		System.out.println("Branch Name : " + account1.branch_name);
		System.out.println("City : " + account1.city);
		System.out.println("State : " + account1.state);
		System.out.println("Fixed Term Amount : " + account1.tfd_amount);
		System.out.println("Tenure : " + account1.tdf_tenure);
		System.out.println("============== Account 2 Details ======================");
		System.out.println("Account Number : " + account2.tfd_acc_num);
		System.out.println("Customer Name : " + account2.tfd_acc_holder_name);
		System.out.println("Ifsc Code : " + account2.ifsc_code);
		System.out.println("Branch Name : " + account2.branch_name);
		System.out.println("City : " + account2.city);
		System.out.println("State : " + account2.state);
		System.out.println("Fixed Term Amount : " + account2.tfd_amount);
		System.out.println("Tenure : " + account2.tdf_tenure);
		
		
	}
}
