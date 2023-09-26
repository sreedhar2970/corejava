package com.object_creation_using_newinstance;

public class IndividualRetirementAccount {
	
	long ira_acc_num = 135456466l;
	String ira_acc_holder_name = "sreedhar reddy";
	String branch_name = "gadwal Branch";
	String ifsc_code = "gdw3565HJ";
	String city = "gadal";
	String state = "Telengana";
	double acc_balance= 5000.0d;
	
	public static void main(String[] args) {
		
		try {
		IndividualRetirementAccount account = IndividualRetirementAccount.class.newInstance();
		System.out.println("Account Number : " + account.ira_acc_num);
		System.out.println("Customer Name : " + account.ira_acc_holder_name);
		System.out.println("Brnach Name : " + account.branch_name);
		System.out.println("Ifsc Code : " + account.ifsc_code);
		System.out.println("City : " + account.city);
		System.out.println("State : " + account.state);
		System.out.println("Account Balance : " + account.acc_balance);
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
