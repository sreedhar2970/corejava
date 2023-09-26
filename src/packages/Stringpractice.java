package packages;

public class Stringpractice {
	
	public static void main(String[] args) {
		String s1 = new String("you cannot change me");
		String s2 ="you cannot";
		String s3 ="change me";
		String s4 ="you cannot change me";
		String s5 =s2 +"change me";
		System.out.println(s5);
		System.out.println(s5==s4);
		String s8 ="ramesh";
		String s9 = s8.concat("reddy");
		System.out.println(s9);
		System.out.println(s8.lastIndexOf('z'));
	}

}
