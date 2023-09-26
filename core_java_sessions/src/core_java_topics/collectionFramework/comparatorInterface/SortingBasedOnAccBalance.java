package core_java_topics.collectionFramework.comparatorInterface;

import java.util.Comparator;

public class SortingBasedOnAccBalance implements Comparator<SavingAccount>{

	@Override
	public int compare(SavingAccount account1, SavingAccount account2) {
		if(account1.acc_balance > account2.acc_balance)
			return 1;
		else if(account1.acc_balance < account2.acc_balance)
			return -1;
		else
			return 0;
	}

}
