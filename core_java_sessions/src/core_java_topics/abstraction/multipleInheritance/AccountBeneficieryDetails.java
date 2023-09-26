package core_java_topics.abstraction.multipleInheritance;

public class AccountBeneficieryDetails implements IBeneficieryService,IAccountService{

	public static void main(String[] args) {
		
		AccountBeneficieryDetails details = new AccountBeneficieryDetails();
		details.addBeneficiery();
		details.updateBeneficiery();
		details.deleteBeneficiery();
		details.isAccountActive();
		details.getAccountDetails();
	}
	@Override
	public void getAccountDetails() {
		System.out.println("This is account details.........");
	}
	@Override
	public void isAccountActive() {
		System.out.println("Account is very much active.....");
	}
	@Override
	public void addBeneficiery() {
		System.out.println("This is add beneficiery......");
	}
	@Override
	public void updateBeneficiery() {
		System.out.println("this is update beneficiery.....");
	}
	@Override
	public void deleteBeneficiery() {
		System.out.println("this is delete beneficiery");
	}

}
