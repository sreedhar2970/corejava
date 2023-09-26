package core_java_topics.variables.localVariable;

public class CertificateOfDepositAccountDetails {

	public static void main(String[] args) {

		CertificateOfDepositAccount account1 = new CertificateOfDepositAccount();
		CertificateOfDepositAccount account2 = new CertificateOfDepositAccount();
		
		account1.setCda_acc_num(12345678l);
		account1.setCda_holder_name("Sheik");
		account1.setSsn_number(456789l);
		account1.setBranch_name("Texas Branch");
		
		account2.setCda_acc_num(12345679l);
		account2.setCda_holder_name("Vinod");
		account2.setSsn_number(9787578l);
		account2.setBranch_name("Chicago Branch");
		
		System.out.println("============ Account 1 Details ==================");
		System.out.println("Account Number : " + account1.getCda_acc_num());
		System.out.println("Customer Name : " + account1.getCda_holder_name());
		System.out.println("SSN Number : " + account1.getSsn_number());
		System.out.println("Branch Name : " + account1.getBranch_name());
		
		//account1.depositAmount(5000.0d);
		
		System.out.println("============ Account 2 Details ==================");
		System.out.println("Account Number : " + account2.getCda_acc_num());
		System.out.println("Customer Name : " + account2.getCda_holder_name());
		System.out.println("SSN Number : " + account2.getSsn_number());
		System.out.println("Branch Name : " + account2.getBranch_name());
		account2.withdrawAmount(2000.0d);
	}

}
