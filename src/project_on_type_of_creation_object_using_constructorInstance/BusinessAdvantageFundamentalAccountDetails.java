package project_on_type_of_creation_object_using_constructorInstance;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BusinessAdvantageFundamentalAccountDetails {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		try {
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
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
