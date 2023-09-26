package core_java_topics.collectionFramework.mapInterface.hashMap.realtime;

import java.util.List;

public class Account {

	long acc_number;
	List<CreditCard> listOfCrediCards;
	
	public Account(long acc_number, List<CreditCard> listOfCrediCards) {
		super();
		this.acc_number = acc_number;
		this.listOfCrediCards = listOfCrediCards;
	}
	@Override
	public String toString() {
		return "Account [acc_number=" + acc_number + ", listOfCrediCards=" + listOfCrediCards + "]";
	}
	
}
