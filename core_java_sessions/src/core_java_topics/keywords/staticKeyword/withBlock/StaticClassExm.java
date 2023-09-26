package core_java_topics.keywords.staticKeyword.withBlock;

public class StaticClassExm {

	static {
		System.out.println("this is second static block");
	}
	public static void main(String[] args) {
		System.out.println("main method.....");
	}
	
	static {
		 System.out.println("this is a static block. It will always get executed before the main method.....");
	}
}
