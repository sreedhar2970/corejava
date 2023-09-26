package core_java_topics.polymorphism.staticPolymorphism.methodOverloading.realtimeExm;

public class BillPayment {

	long acc_number;
	String bank_name;
	long electric_meter_number;
	String due_date;
	String locality_address;
	double electricity_bill_amount;
	long water_meter_number;
	double water_bill_amount;
	long dth_cust_id;
	String cust_name;
	double dth_monthly_pay;
	String last_date_payment;
	long gas_number;
	double gas_amount;
	double available_balance;
	
	public static void makePayment(long electric_meter_number,String locality_address,String due_date,double electricity_bill_amount) {
		System.out.println("============= Electricity Payment =============");
		System.out.println("Electric Meter Number : " + electric_meter_number);
		System.out.println("Address : " + locality_address);
		System.out.println("Due Date : " + due_date);
		System.out.println("Electricity Bill Amount : " + electricity_bill_amount);
	}
	
	public static void makePayment(long water_meter_number,double water_bill_amount,double available_balance) {
		System.out.println("============= Water Payment =============");
		System.out.println("Water Meter Number : " + water_meter_number);
		System.out.println("Water Bill Amount  : " + water_bill_amount);
		System.out.println("Available Balance  : " + available_balance);
	}
	
	public static void makePayment(long dth_cust_id,String cust_name,double dth_monthly_pay,String last_date_payment) {
		System.out.println("============= DTH Payment =============");
		System.out.println("Customer Id : " + dth_cust_id);
		System.out.println("Customer Name  : " + cust_name);
		System.out.println("Monthly Pay : " + dth_monthly_pay);
		System.out.println("Last Date Payment : " + last_date_payment);
	}
}