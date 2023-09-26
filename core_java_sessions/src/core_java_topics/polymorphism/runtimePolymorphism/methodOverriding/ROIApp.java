package core_java_topics.polymorphism.runtimePolymorphism.methodOverriding;

public class ROIApp {

	public static void main(String[] args) {
		RBIBank icici = new IciciBank();
		RBIBank axis = new AxisBank();
		RBIBank hdfc = new HdfcBank();
		
		System.out.println("Rate of interest of ICICI Bank : " + icici.getRateOfInterest());
		System.out.println("Rate of interest of Axis Bank : " + axis.getRateOfInterest());
		System.out.println("Rate of interest of Hdfc Bank : " + hdfc.getRateOfInterest());
	}

}
