package core_java_topics.exceptionHandling.multipleCatchBlock;

public class MultipleCatchBlockExm {

	public static void main(String[] args) {

		try {
			System.out.println("Important code1...");
			System.out.println("Important code2...");
			String name = null;
			int arr[] = new int[5];
			arr[9] = 20/0;
			System.out.println("The number is : " + arr[9]);
			System.out.println("Length of the name : " + name.length());
			
		}catch (ArithmeticException ae) {
			ae.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException aie) {
			aie.printStackTrace();
		}catch (NullPointerException e) {
			System.out.println("Name can't be null...");
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Important code3....");
		System.out.println("Important code4....");
	}

}
