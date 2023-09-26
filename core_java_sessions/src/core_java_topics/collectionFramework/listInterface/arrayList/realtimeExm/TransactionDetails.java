package core_java_topics.collectionFramework.listInterface.arrayList.realtimeExm;

import java.util.ArrayList;

public class TransactionDetails {

	public static void main(String[] args) {

		// create ArrayList object
		ArrayList<AccountTransactionStatement> listOfTransaction = new ArrayList<AccountTransactionStatement>();
		
		listOfTransaction.add(new AccountTransactionStatement(111111111l,"Zeeshan","10-05-2023", 1500.0d));
		listOfTransaction.add(new AccountTransactionStatement(222222222l,"Farhan","12-05-2023", 500.0d));
		listOfTransaction.add(new AccountTransactionStatement(333333333l,"Suleman","14-05-2023", 2500.0d));
		listOfTransaction.add(new AccountTransactionStatement(444444444l,"Irfan","17-05-2023", 3500.0d));
		listOfTransaction.add(new AccountTransactionStatement(555555555l,"Faizan","20-05-2023", 600.0d));
		listOfTransaction.add(new AccountTransactionStatement(666666666l,"Rehan","22-05-2023", 4500.0d));
		listOfTransaction.add(new AccountTransactionStatement(777777777l,"Furqan","25-05-2023", 5500.0d));
		listOfTransaction.add(new AccountTransactionStatement(888888888l,"Ali Saifuddin","29-05-2023", 10500.0d));
		
		//using for-each loop to traverse through list object
		for(AccountTransactionStatement statement : listOfTransaction) {
			System.out.println(statement);
		}
	}

}
