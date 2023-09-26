package core_java_topics.polymorphism.staticPolymorphism.methodOverloading.realtimeExm;

public class BillPaymentApp {

	public static void main(String[] args) {
		BillPayment.makePayment(43545646435l,"Mohammed Kamran", 450.0d,"15-06-2023");
		BillPayment.makePayment(567456359l,300.0d, 5000.0d);
		BillPayment.makePayment(34566777588l,"12-12-86/2b,Arab Mohalla, Raichur","15-06-2023",4000.0d);
		BillPaymentApp.main(1000);
		BillPaymentApp.main("Mohammed Kamran");
		BillPaymentApp.main(34567.0d);
	}
	
	public static void main(int number) {
		System.out.println("Number : " + number);
	}

	public static void main(String name) {
		System.out.println("Name : " + name);
	}
	public static void main(double doubleNumber) {
		System.out.println("Double Number : " + doubleNumber);
	}
}
