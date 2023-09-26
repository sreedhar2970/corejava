package core_java_topics.abstraction.abstractExm2;

public class MaxLifeInsurance extends PolicyBazaar{

	@Override
	public void viewFreeQuote() {
		System.out.println("This is a functionality of Max Life Insurance ..");
	}

	@Override
	public void getDetailsOfInsuranceProvider() {
		System.out.println("Insurer : Max Life Insurance");
		System.out.println("Life Cover : 1.5 Cr");
		System.out.println("Cover Till Age : 75 years");
		System.out.println("Claims Settled : 88.5%");
		System.out.println("Premium Amount : Rs2489");
	}

}
