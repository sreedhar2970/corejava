package core_java_topics.iopackage;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExm {

	public static void main(String[] args) {

		try {
			
			FileOutputStream fout = new FileOutputStream("D:\\iopackage\\test3.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String statement = "BufferedOutputStream class increases the performance";
			byte[] b=statement.getBytes();
			bout.write(b);
			bout.close();
			System.out.println("data saved....");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
