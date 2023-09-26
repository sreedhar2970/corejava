package core_java_topics.inheritance.multilevelInheritance;

public class AssetDetails {

	private SavingAccount savingAccount;
	private CheckingAccount checkingAccount;
	
	public static void main(String[] args) {
		
		AssetDetails asset = new AssetDetails(); 
		asset.createAsset();
		asset.displayAsset();
	}
	private void createAsset() {
		savingAccount = new SavingAccount();
		savingAccount.setAsset_id(1234);
		savingAccount.setAsset_type("Bank Account Asset");
		savingAccount.setAcc_number(123456789l);
		savingAccount.setBank_name("Bank Of America");
		savingAccount.setBalance(50000.0d);
		savingAccount.setInterestRate(6.7d);
		
		checkingAccount = new CheckingAccount();
		checkingAccount.setAsset_id(6789);
		checkingAccount.setAsset_type("Bank Account Asset");
		checkingAccount.setAcc_number(123456788l);
		checkingAccount.setBank_name("Bank Of America");
		checkingAccount.setBalance(60000.0d);
		checkingAccount.setOverDraftLimit(50000.0d);
	}
	private void displayAsset() {
		savingAccount.displaySAAccountInfo();
		checkingAccount.displayCAAccInfo();
	}
}
