package core_java_topics.collectionFramework.mapInterface.hashMap.realtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CreditCardDetails {

	public static void main(String[] args) {

		List<CreditCard> listOfCreditCards1 = new ArrayList<CreditCard>();
		listOfCreditCards1.add(new CreditCard(123456789l,"Mohammed Kamran","Hdfc Bank","25-09-2030",754, 50000.0d));
		listOfCreditCards1.add(new CreditCard(123456788l,"Mohammed Kamran","Icici Bank","15-09-2032",874, 60000.0d));
		listOfCreditCards1.add(new CreditCard(123456787l,"Mohammed Kamran","Axis Bank","23-09-2035",623, 70000.0d));
		
		List<CreditCard> listOfCreditCards2 = new ArrayList<CreditCard>();
		listOfCreditCards2.add(new CreditCard(123456453l,"Amit","Sbi Bank","10-09-2030",754, 100000.0d));
		listOfCreditCards2.add(new CreditCard(123456231l,"Amit","Pnb Bank","19-09-2032",908, 150000.0d));
		listOfCreditCards2.add(new CreditCard(123456278l,"Amit","DBS Bank","18-09-2034",624, 200000.0d));
		
		List<CreditCard> listOfCreditCards3 = new ArrayList<CreditCard>();
		listOfCreditCards3.add(new CreditCard(123456967l,"Roshni","Sbh Bank","10-09-2031",897, 100000.0d));
		listOfCreditCards3.add(new CreditCard(123456800l,"Roshni","BofA Bank","21-09-2034",674, 300000.0d));
		
		List<CreditCard> listOfCreditCards4 = new ArrayList<CreditCard>();
		listOfCreditCards4.add(new CreditCard(123456801l, "Sai", "Citi Bank", "14-09-2035",954,50000.0d));
		
		HashMap<Long, List<CreditCard>> mapObject = new HashMap<Long, List<CreditCard>>();
		
		mapObject.put(111111111l, listOfCreditCards1);
		mapObject.put(222222222l, listOfCreditCards2);
		mapObject.put(333333333l, listOfCreditCards3);
		mapObject.put(444444444l, listOfCreditCards4);
		
		for(Long account : mapObject.keySet()) {
			Long acc_num = account.longValue();
			System.out.println("Account Number : " + acc_num + " Credit Card : " + mapObject.get(acc_num));
		}
		
	}

}
