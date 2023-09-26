package core_java_topics.collectionFramework.setInterface.hashSet.realtime;

import java.util.HashSet;
import java.util.Iterator;

public class AccountDetails {

	public static void main(String[] args) {

		HashSet<Account> account = new HashSet<Account>();
		account.add(new Account(123456789l,"Mohammed Kamran", "RCR354KA", "Raichur Braanch", 50000.0d));
		account.add(new Account(123456788l, "Amit", "PUN674MH", "Pune Branch", 70000.0d));
		account.add(new Account(123456787l,"Roshni", "CHN784TN", "Chennai Branch", 60000.0d));
		account.add(new Account(123456786l, "Sarawad", "HYD345TS", "Hyderabad Branch", 80000.0d));
		account.add(new Account(123456785l,"Sheik", "DRE762TA", "Gulburga Branch", 89000.0d));
		account.add(new Account(123456784l, "Mohan", "MUM423MH", "Mumbai Branch", 90000.0d));
		account.add(new Account(123456783l,"Azhar", "CHD345PN", "Chandigarh Branch", 150000.0d));
		account.add(new Account(123456782l, "Sai Sharan", "PND234TN", "Pondichery Branch", 170000.0d));
		account.add(new Account(123456781l, "Farhan", "RCR782KA", "Raichur Branch", 50000.0d));
		
		// iterate over the hashset object
		Iterator<Account> itrAcc = account.iterator();
		while(itrAcc.hasNext()) {
			System.out.println(itrAcc.next());
		}
	}

}
