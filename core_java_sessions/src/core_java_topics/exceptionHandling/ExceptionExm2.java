package core_java_topics.exceptionHandling;

public class ExceptionExm2 {

	public static void main(String[] args) {

		System.out.println("Important Code1...");
		System.out.println("Important Code2...");
			try {
				int array[] = {30,67,87,54};
				System.out.println("Element value : " + array[2]);
			}catch (Exception e) {
				e.printStackTrace();
			}
		System.out.println("Important Code3...");
		System.out.println("Important Code4...");
		System.out.println("Important Code5...");
	}

}
