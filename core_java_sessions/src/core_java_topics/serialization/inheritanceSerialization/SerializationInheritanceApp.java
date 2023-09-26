package core_java_topics.serialization.inheritanceSerialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationInheritanceApp {

	public static void main(String[] args) {

		try {
				HomeLoan homeLoan = new HomeLoan(1234567l,"Home Loan","Bank Of America",123456789l, "Mohammed Kamran","12-12-86/2b, Arab Mohalla",
						"Opp Court complex, Raichur", 1500000.0d, 8.5d);
				ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("D:\\iopackage\\loanStatement.txt"));
				oout.writeObject(homeLoan);
				oout.close();
				oout.flush();
				System.out.println("Data Saved Successfully............");
				
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
