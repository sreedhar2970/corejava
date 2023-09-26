package core_java_topics.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class AccountStatementDeSerialization {
	
	public static void main(String[] args) {
		try {
				ObjectInputStream oin = new ObjectInputStream(new FileInputStream("D:\\iopackage\\statement.txt"));
				AccountStatement statement =  (AccountStatement) oin.readObject();
				System.out.println("Cust Id : " + statement.getCust_id());
				System.out.println("Account Number : " + statement.getAccount_number());
				System.out.println("Account Branch : " + statement.getAccount_branch());
				System.out.println("Account Type : " + statement.getAccount_type());
				System.out.println("Customer Name : " + statement.getCust_name());
				System.out.println("City : " + statement.getCity());
				System.out.println("State : " + statement.getState());
				System.out.println("Cell Number : " + statement.getPhone_number());
				System.out.println("Over Draft Limit : " + statement.getOdl_limit());
				System.out.println("Currency : " + statement.getCurrency());
				System.out.println("Account Status : " + statement.getAccount_status());
				System.out.println("Branch Code : " + statement.getBranch_code());
				System.out.println("Closing Balance : " + statement.getClosing_balance());
				oin.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
