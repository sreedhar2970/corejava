package core_java_topics.serialization.transientKeyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FixedTermCDAccountDetails {


	public static void main(String[] args) {
		try {
			//FixedTermCDAccount account = new FixedTermCDAccount();
			/*FixedTermCDAccount account1 = new FixedTermCDAccount(1234567891, "Mohammed Kamran","Raichur Branch",3456435646l,
					"kamranmohammed2005@gmail.com",
					"Opp court complex","12-12-86/2b","Arab Mohalla","Raichur City","Karnataka",5, 6.5d, 100000.0d);
			
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("D:\\iopackage\\fdaAccount.txt"));
			oout.writeObject(account1);
			oout.close();
			oout.flush();
			System.out.println("Data Saved successfully..................");*/
			
			// De-serialization
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\iopackage\\fdaAccount.txt"));
			FixedTermCDAccount account = (FixedTermCDAccount) ois.readObject();
			System.out.println(account);
			ois.close();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
