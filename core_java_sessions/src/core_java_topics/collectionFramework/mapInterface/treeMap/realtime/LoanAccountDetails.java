package core_java_topics.collectionFramework.mapInterface.treeMap.realtime;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LoanAccountDetails {

	public static void main(String[] args) {

		TreeMap<Long, List<Loans>> mapObject = new TreeMap<Long, List<Loans>>();
		
		ArrayList<Loans> loan1ListObject = new ArrayList<Loans>();
		loan1ListObject.add(new Loans(123456789l,"Business Loan","Mohammed Kamran", 300000.0d, 7.6d));
		loan1ListObject.add(new Loans(123456788l,"Car Loan","Mohammed Kamran", 700000.0d, 8.9d));
		loan1ListObject.add(new Loans(123456754l,"Home Loan","Mohammed Kamran", 2000000.0d, 6.5d));
		
		ArrayList<Loans> loan2ListObject = new ArrayList<Loans>();
		loan2ListObject.add(new Loans(123445342l,"Bike Loan","Mohammed Farhan", 50000.0d, 10.5d));
		loan2ListObject.add(new Loans(123489763l,"Education Loan","Mohammed Farhan", 1000000.0d, 7.9d));
		
		mapObject.put(1243765l, loan1ListObject);
		mapObject.put(6532536l, loan2ListObject);
		
		for(Map.Entry<Long, List<Loans>> loanObject : mapObject.entrySet()) {
			Long account_number = loanObject.getKey();
			System.out.println(account_number);
			System.out.println("==== List of Loan linked to account =======");
			System.out.println(loanObject.getValue());
		}
	}

}
