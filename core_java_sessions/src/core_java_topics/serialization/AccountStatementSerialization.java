package core_java_topics.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AccountStatementSerialization {
	
	public static void main(String[] args) {
		try {
			
			AccountStatement statement = new AccountStatement(54175688l, 23455763465l,"Raichur Branch", "Salary Account", "Mohammed Kamran", 
					"Raichur City","Karnataka",7207513883l,0, "INR", "Active", 665, 110878.0d);
			
			FileOutputStream fout = new FileOutputStream("D:\\iopackage\\statement.txt");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			oout.writeObject(statement);
			oout.close();
			fout.close();
			System.out.println("Data serialized successfully.....");
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
