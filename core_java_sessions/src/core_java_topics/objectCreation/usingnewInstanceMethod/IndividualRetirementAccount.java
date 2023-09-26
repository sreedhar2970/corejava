package core_java_topics.objectCreation.usingnewInstanceMethod;

public class IndividualRetirementAccount {

	long ira_acc_num = 135456466l;
	String ira_acc_holder_name = "Mohammed Kamran";
	String branch_name = "Raichur Branch";
	String ifsc_code = "RCR3565HJ";
	String city = "Raichur";
	String state = "Karnataka";
	double acc_balance= 5000.0d;
	
	public static void main(String[] args) {
		
		try {
				// using the class Class newInstance(). We are creating the object
				IndividualRetirementAccount account = IndividualRetirementAccount.class.newInstance();

				System.out.println("Account Number : " + account.ira_acc_num);
				System.out.println("Customer Name : " + account.ira_acc_holder_name);
				System.out.println("Brnach Name : " + account.branch_name);
				System.out.println("Ifsc Code : " + account.ifsc_code);
				System.out.println("City : " + account.city);
				System.out.println("State : " + account.state);
				System.out.println("Account Balance : " + account.acc_balance);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
