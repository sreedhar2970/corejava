package core_java_topics.abstraction.abstractExm2;

public class HDFCLifeInsurance extends PolicyBazaar{

	@Override
	public void viewFreeQuote() {
		System.out.println("This is a functionality of HDFC Life Insurance ..");
	}

	@Override
	public void getDetailsOfInsuranceProvider() {
		System.out.println("Insurer : HDFC Life Insurance");
		System.out.println("Life Cover : 50 Lakhs");
		System.out.println("Cover Till Age : 65 years");
		System.out.println("Claims Settled : 78.5%");
		System.out.println("Premium Amount : Rs1489");
	}

}
