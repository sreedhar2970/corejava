package core_java_topics.iopackage;

import java.io.FileInputStream;

public class FileInputStreamExm1 {

	public static void main(String[] args) {
		try {
			
			 FileInputStream fin = new FileInputStream("D:\\iopackage\\test1.txt");
			 int i = fin.read();
			 System.out.println((char)i);
			 fin.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
