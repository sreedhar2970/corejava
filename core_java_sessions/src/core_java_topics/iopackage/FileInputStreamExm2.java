package core_java_topics.iopackage;

import java.io.FileInputStream;


public class FileInputStreamExm2 {

	public static void main(String[] args) {
		try {
				FileInputStream fin = new FileInputStream("C:\\Users\\91720\\OneDrive\\Desktop\\15_April_2023.txt");
				int i = 0;
				while((i=fin.read())!=-1) {
					System.out.print((char)i);
				}
				fin.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
