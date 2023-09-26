package core_java_topics.objectCreation.usingConstrutorNewInstanceMethod;

import java.lang.reflect.Constructor;

public class BusinessAdvantageFundamentalAccountDetails {

	public static void main(String[] args) {

		try {
			// pre-defined class called Constructor
			// using newInstance() of Constructor class
			// first call the getConstrutor() of Constructor class
			// call the newInstance() on the object of Constructor class
			Constructor<BusinessAdvantageFundamentalAccount> object = BusinessAdvantageFundamentalAccount.class.getConstructor();
			BusinessAdvantageFundamentalAccount account = object.newInstance();
			account.setBfa_acc_num(123456789l);
			account.setBfa_customer_name("Mohammed Kamran");
			account.setBranch_name("Raichur Branch");
			account.setCity("Raichur City");
			account.setSsn_num(45465786869l);
			account.setBfa_acc_balance(50000.0d);
			
			System.out.println("============ Account Details =================");
			System.out.println("Account Number : " + account.getBfa_acc_num());
			System.out.println("Customer Name : " + account.getBfa_customer_name());
			System.out.println("Branch Name : " + account.getBranch_name());
			System.out.println("City : " + account.getCity());
			System.out.println("Social Security Number : " + account.getSsn_num());
			System.out.println("Avaialable Balance : " + account.getBfa_acc_balance());
		}catch(Exception ex) {
			ex.printStackTrace();;
		}
	}

}
