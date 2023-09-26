package core_java_topics.serialization.aggregationSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AggregationSerializationApp {

	public static void main(String[] args) {
		try {
			// this is serialization
			
			/*CustomerAddress customerAddress = new CustomerAddress("Mohammed Kamran","12-12-86/2b, Arab Mohalla", "Opp court complex, Raichur",
					"Raichur City","Karnataka", 584101l, "5456GTDR454","kamranmohammed2005@gmail.com");
			CreditCard card = new CreditCard(35646545356l,"Kamran", "20-05-2030",643, 50000.0d, customerAddress);
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("D:\\iopackage\\creditCard.txt"));
			oout.writeObject(card);
			oout.close();
			oout.flush();
			System.out.println("Data Serialized successfully.....");*/
			
			// this is de-serialization
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\iopackage\\creditCard.txt"));
			//Creditcard card1 =(Creditcard) ois.readObject();
			CreditCard card1 = (CreditCard) ois.readObject();
			System.out.println(card1);
			ois.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
