package core_java_topics.exceptionHandling.customException;


public class TestCustomException {

	public static void main(String[] args) {
		System.out.println("important code1.....");
		try {
			 throw new CustomExceptionExm("This is an example of custom exception");
		}catch(CustomExceptionExm e) {
			System.out.println(e.getMessage());
		}
		System.out.println("important code2....");
	}

}
