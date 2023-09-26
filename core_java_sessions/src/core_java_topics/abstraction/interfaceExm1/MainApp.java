package core_java_topics.abstraction.interfaceExm1;

public class MainApp {

	public static void main(String[] args) {
		Bank sbi = new SBIBank();
		Bank indian =new INdianOverSeasBank();
		Bank canara = new CanaraBank();
		
		System.out.println("Car loan rate of interest of SBI : " + sbi.getRateOfInterest());
		System.out.println("Car loan rate of interest of Indian Bank : " + indian.getRateOfInterest());
		System.out.println("Car loan rate of interest of Canara Bank : " + canara.getRateOfInterest());
	}

}
