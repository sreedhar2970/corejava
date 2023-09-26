package core_java_topics.collectionFramework.setInterface.linkedHashSet.realtime;

import java.util.LinkedHashSet;

public class CreditCardsDetails {

	public static void main(String[] args) {

		LinkedHashSet<CreditCards> setObject = new LinkedHashSet<CreditCards>();
		setObject.add(new CreditCards(123456789l,"Amit", "12-09-2030",434, 90000.0d));
		setObject.add(new CreditCards(123456786l,"Manoj", "28-09-2030",845, 100000.0d));
		setObject.add(new CreditCards(123456787l,"Azhar", "23-09-2030",634, 80000.0d));
		setObject.add(new CreditCards(123456788l,"Sai", "14-09-2030",634, 70000.0d));
		setObject.add(new CreditCards(123456785l,"Shubham", "18-09-2030",865, 75000.0d));
		setObject.add(new CreditCards(123456785l,"Shubham", "18-09-2030",865, 75000.0d));
		
		for(CreditCards cards : setObject) {
			System.out.println(cards);
		}
		
	}

}
