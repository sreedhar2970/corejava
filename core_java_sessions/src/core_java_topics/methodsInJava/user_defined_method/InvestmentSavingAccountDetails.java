package core_java_topics.methodsInJava.user_defined_method;

public class InvestmentSavingAccountDetails {
	
	public static void main(String[] args) {
		InvestmentSavingAccount account1 = new InvestmentSavingAccount();
		InvestmentSavingAccount account2 = new InvestmentSavingAccount();

		account1.setIsa_acc_num(123456789l);
		account1.setIsa_customer_name("Manoranjan");
		account1.setIsa_acc_balance(5000.0d);
		account1.setBranch_name("Bangalore Branch");
		account1.setIfsc_code("BNG45665KL");

		account2.setIsa_acc_num(123456788l);
		account2.setIsa_customer_name("Subrat");
		account2.setIsa_acc_balance(8000.0d);
		account2.setBranch_name("Odhisha Branch");
		account2.setIfsc_code("OD5675YU");

		System.out.println("=========== Account 1 Details ===================");
		System.out.println("Account Number : " + account1.getIsa_acc_num());
		System.out.println("Customer Name : " + account1.getIsa_customer_name());
		System.out.println("Branch Name : " + account1.getBranch_name());
		System.out.println("Ifsc Code : " + account1.getIfsc_code());
		System.out.println("Acccount Balance : " + account1.getIsa_acc_balance());
		System.out.println("====== Account statement ==========");
		account1.generateStatement(123456789l);
		System.out.println("=========== Account 2 Details ===================");
		System.out.println("Account Number : " + account2.getIsa_acc_num());
		System.out.println("Customer Name : " + account2.getIsa_customer_name());
		System.out.println("Branch Name : " + account2.getBranch_name());
		System.out.println("Ifsc Code : " + account2.getIfsc_code());
		System.out.println("Acccount Balance : " + account2.getIsa_acc_balance());
		account2.changePin(1233);
	}
}
