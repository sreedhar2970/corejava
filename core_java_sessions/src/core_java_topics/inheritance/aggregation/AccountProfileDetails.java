package core_java_topics.inheritance.aggregation;

public class AccountProfileDetails {

	public static void main(String[] args) {

		ProfileDetails details = new ProfileDetails("Mohammed Kamran","12-12-86/2b,Arab Mohalla","Raichur City","Karnataka",584101l, "DGH453DF");
		SavingAccount account = new SavingAccount(123456789l,"Raichur Branch","Kamran",6000.0d, details);
		account.displayProfileDetails();
	}

}
