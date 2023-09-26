package core_java_topics.collectionFramework.comparatorInterface;

import java.util.Comparator;

public class SortingBasedOnBranch implements Comparator<SavingAccount> {

	@Override
	public int compare(SavingAccount account1, SavingAccount account2) {
		
		return account1.branch_name.compareTo(account2.branch_name);
	}

}
