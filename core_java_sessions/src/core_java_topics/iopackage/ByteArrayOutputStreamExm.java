package core_java_topics.iopackage;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamExm {

	public static void main(String[] args) {

		try {
			
			FileOutputStream fout1 = new FileOutputStream("D:\\iopackage\\test4.txt");
			FileOutputStream fout2 = new FileOutputStream("D:\\iopackage\\test5.txt");
			
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			bout.write(65);
			bout.writeTo(fout1);
			bout.writeTo(fout2);
			
			bout.flush();
			bout.close();
			System.out.println("Data Saved.......");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
