package core_java_topics.variables.staticVariable;

public class FixedTermDepositAccountDetails {

	public static void main(String[] args) {

		FixedTermDepositAccount account1 = new FixedTermDepositAccount();
		FixedTermDepositAccount account2 = new FixedTermDepositAccount();
		
		account1.setFda_account_num(123456789l);
		account1.setFda_acc_holder_name("Ramesh");
		account1.setFd_amount(100000.0d);
		account1.setTenure(5);
		account1.setRoi(5.6d);
		
		account2.setFda_account_num(123456788l);
		account2.setFda_acc_holder_name("Sangmesh");
		account2.setFd_amount(50000.0d);
		account2.setTenure(5);
		account2.setRoi(6.6d);
		
		System.out.println("============ Account 1 Details =======================");
		System.out.println("Account Number : " + account1.getFda_account_num());
		System.out.println("Account Holder Name : " + account1.getFda_acc_holder_name());
		System.out.println("Fixed Term Amount : " + account1.getFd_amount());
		System.out.println("Tenure : " + account1.getTenure());
		System.out.println("Rate Of Interest : " + account1.getRoi());
		System.out.println("Bank Name : " + FixedTermDepositAccount.BANK_NAME);
		
		System.out.println("============ Account 2 Details =======================");
		System.out.println("Account Number : " + account2.getFda_account_num());
		System.out.println("Account Holder Name : " + account2.getFda_acc_holder_name());
		System.out.println("Fixed Term Amount : " + account2.getFd_amount());
		System.out.println("Tenure : " + account2.getTenure());
		System.out.println("Rate Of Interest : " + account2.getRoi());
		System.out.println("Bank Name : " + FixedTermDepositAccount.BANK_NAME);
	}
}