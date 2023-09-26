package core_java_topics.iopackage;

import java.io.FileOutputStream;

public class FileOutputStreamExm1 {

	public static void main(String[] args) {
		
		try {
				FileOutputStream oout = new FileOutputStream("D:\\iopackage\\test2.txt");
				String sentance = "I will be joining ConvergeOne on 10 july";
				byte b[] = sentance.getBytes();
				oout.write(b);
				oout.close();
				System.out.println("Data Saved Successfully......");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
