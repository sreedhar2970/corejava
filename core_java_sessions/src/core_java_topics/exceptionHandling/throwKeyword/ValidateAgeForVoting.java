package core_java_topics.exceptionHandling.throwKeyword;

public class ValidateAgeForVoting {

	public static void main(String[] args) {
		System.out.println("Important code1....");
		try{
			validateAge(12);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Important code2......");

	}
	public static void validateAge(int age) {
		if(age<18) {
			throw new ArithmeticException("You are not eligible to vote as your age is less than 18");
		}else {
			System.out.println("You can vote....");
		}
	}

}
