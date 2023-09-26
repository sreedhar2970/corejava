package core_java_topics.exceptionHandling.nestedTryBlock;

public class NestedTryBlockExm {

	public static void main(String[] args) {
		System.out.println("Importat code1..........");
		// outer try block
		try {
				//inner try block 1
				try {
					System.out.println("Want to divide number....");
					int number = 50/0;
					System.out.println("Number : " + number);
				}catch (ArithmeticException ae) {
					ae.printStackTrace();
				}
				// inner try block 2
				try {
					int array[] = new int[4];
					array[2] = 10;
					System.out.println("The number at 8th index : " + array[2]);
				}catch (ArrayIndexOutOfBoundsException aie) {
					aie.printStackTrace();
				}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Database connection closed....");
		}
		System.out.println("Important code2...");
	}

}
