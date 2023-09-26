package core_java_topics.exceptionHandling;


public class ProblemExm {

	public static void main(String[] args) {

		System.out.println("Important code1.....");
		System.out.println("Important code2.....");
		System.out.println("Important code3.....");
		try{
			int number = 500/0;
			System.out.println("Number : " + number);
		}catch (Exception e) {
			e.printStackTrace();
			//System.out.println(e);
		}
		System.out.println("Important code4.....");
		System.out.println("Important code5.....");
	}

}
