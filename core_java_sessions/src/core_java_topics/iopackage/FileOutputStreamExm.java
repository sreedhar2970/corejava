package core_java_topics.iopackage;

import java.io.FileOutputStream;

public class FileOutputStreamExm {

	public static void main(String[] args) {

		try {
			// first create the object of FileOutputStream class and pass the fully qualified path name....
			FileOutputStream out = new FileOutputStream("D:\\iopackage\\test1.txt");
			out.write(74);
			out.close();
			System.out.println("Data saved successfully......");
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
