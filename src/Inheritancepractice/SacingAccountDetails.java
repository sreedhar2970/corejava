package Inheritancepractice;

public class SacingAccountDetails {

	public static void main(String[] args) {
		
		Address address = new Address("gadwal","gav",509213);
	 
	    SavingAccount account = new SavingAccount(234765,"hdfc",address); 
           System.out.println(account);
	}

}
