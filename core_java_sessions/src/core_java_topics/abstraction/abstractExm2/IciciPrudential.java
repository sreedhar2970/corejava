package core_java_topics.abstraction.abstractExm2;

public class IciciPrudential extends PolicyBazaar{

	@Override
	public void viewFreeQuote() {
		System.out.println("This is a functionality of Icici Prudential...");
	}

	@Override
	public void getDetailsOfInsuranceProvider() {
		System.out.println("Insurer : Icici Prudential");
		System.out.println("Life Cover : 2 Cr");
		System.out.println("Cover Till Age : 85 years");
		System.out.println("Claims Settled : 98.5%");
		System.out.println("Premium Amount : Rs3489");
	}

}
