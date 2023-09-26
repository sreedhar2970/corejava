package core_java_topics.innerClasses.staticInnerClass;

public class OuterClass {

	private static int CUST_ID = 543;
	private static String DOMESTIC_CUSTOMER_BRANCH ="Raichur Branch";
	static  long SECURITY_SERIAL_NUMBER = 6564537L;
	static String VALUATION_DATE = "22-05-2023";
	static String GURANTOR_BRANCH = "Gulburga Branch";
	
	static class WholeSaleCollateralBasic{
		
		void displayWholeSaleDetails() {
			System.out.println("Customer Id : " + CUST_ID);
			System.out.println("Domestic Customer Branch : " + DOMESTIC_CUSTOMER_BRANCH);
			System.out.println("Serial Number : " + SECURITY_SERIAL_NUMBER);
			System.out.println("Valuation Date : " + VALUATION_DATE);
			System.out.println("Gurantor Branch : " + GURANTOR_BRANCH);
		}
	}
	public static void main(String[] args) {
		OuterClass.WholeSaleCollateralBasic basicCollateral =new OuterClass.WholeSaleCollateralBasic();
		basicCollateral.displayWholeSaleDetails();
		
	}
	
}
