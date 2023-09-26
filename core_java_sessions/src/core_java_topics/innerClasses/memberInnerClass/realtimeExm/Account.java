package core_java_topics.innerClasses.memberInnerClass.realtimeExm;

public class Account {

	private String bank_name = "ICICI Bank";
	
	class SavingAccount{
		private long sa_acc_num = 6735432885l;
		private String sa_customer_name = "Mohammed Kamran";
		private double sa_acc_balance = 50000.0d;
		
		void displaySAInfo() {
			System.out.println("Saving Account Number : " + sa_acc_num);
			System.out.println("Saving Account Customer Name : " + sa_customer_name);
			System.out.println("Available Balance : " + sa_acc_balance);
			System.out.println("Bank Name : " + bank_name);
			System.out.println("===========================================================");
		}
	}
	
	class CheckingAccount{
		private long ca_acc_num = 745656855884l;
		private String ca_holder_name = "Mohammed Farhan";
		private double ca_balance = 60000.0d;
		
		void displayCAInfo() {
			System.out.println("Checking Account Number : " + ca_acc_num);
			System.out.println("Checking Account Holder Name : " + ca_holder_name);
			System.out.println("Current Balance : " + ca_balance);
			System.out.println("Bank Name : " + bank_name);
		}
	}
	public static void main(String[] args) {
		
		Account account = new Account();
		Account.SavingAccount savingAccount = account.new SavingAccount();
		Account.CheckingAccount checkingAccount = account.new CheckingAccount();
		
		savingAccount.displaySAInfo();
		checkingAccount.displayCAInfo();
	}
}
