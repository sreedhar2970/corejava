package core_java_topics.iopackage;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamExm {

	public static void main(String[] args) {

		try {
				FileOutputStream fout = new FileOutputStream("D:\\iopackage\\test6.txt");
				DataOutputStream dout = new DataOutputStream(fout);
				dout.write(76);
				dout.flush();
				dout.close();
				System.out.println("Data Saved");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
