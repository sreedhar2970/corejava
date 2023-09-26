package core_java_topics.abstraction.abstractExm2;

public class InsuranceApp {

	public static void main(String[] args) {

		IciciPrudential icici = new IciciPrudential();
		MaxLifeInsurance max = new MaxLifeInsurance();
		HDFCLifeInsurance hdfc = new HDFCLifeInsurance();
		
		icici.getDetailsOfInsuranceProvider();
		System.out.println("====================================================================");
		max.getDetailsOfInsuranceProvider();
		System.out.println("====================================================================");
		hdfc.getDetailsOfInsuranceProvider();
	}

}
