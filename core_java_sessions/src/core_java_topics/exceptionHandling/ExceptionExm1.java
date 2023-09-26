package core_java_topics.exceptionHandling;

public class ExceptionExm1 {

	public static void main(String[] args) {

		System.out.println("Important Code1...");
		System.out.println("Important Code2...");
		try{
			String name = null;
			System.out.println(name.length());
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Important Code3...");
		System.out.println("Important Code4...");
	}

}
