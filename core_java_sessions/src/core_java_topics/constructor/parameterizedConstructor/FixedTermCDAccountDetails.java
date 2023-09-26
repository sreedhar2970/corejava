package core_java_topics.constructor.parameterizedConstructor;

public class FixedTermCDAccountDetails {


	public static void main(String[] args) {

		FixedTermCDAccount account = new FixedTermCDAccount();
		FixedTermCDAccount account1 = new FixedTermCDAccount(1234567891, "Mohammed Kamran","Raichur Branch",3456435646l,
				"kamranmohammed2005@gmail.com",
				"Opp court complex","12-12-86/2b","Arab Mohalla","Raichur City","Karnataka",5, 6.5d, 100000.0d);
		
		FixedTermCDAccount account2 = new FixedTermCDAccount(1234567881, "Farhan","Raichur Branch",3456435646l,"farhan@gmail.com",
				"Opp court complex","12-12-86/2b","Arab Mohalla","Raichur City","Karnataka",15, 6.5d, 500000.0d);
		
		account1.displayFTADetails();
		account2.displayFTADetails();
		System.out.println("=========== Credit card details ================");
		//account.getCreditCardDetails();
		account.getCreditCardDetails();
	}

}
