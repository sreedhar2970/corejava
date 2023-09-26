package core_java_topics.iopackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class FilterOutputStreamExm {

	public static void main(String[] args) {
		try {
			
			File file = new File("D:\\iopackage\\test7.txt");
			FileOutputStream fout = new FileOutputStream(file);
			FilterOutputStream foout = new FilterOutputStream(fout);
			String sentance = "This is FilterOutputStream class example";
			byte[] b = sentance.getBytes();
			foout.write(b);
			foout.flush();
			foout.close();
			System.out.println("Data Saved Successfully.............");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
