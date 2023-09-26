package core_java_topics.keywords.thisKeyword.currentClassConstructor;

public class CurrentClassConstructor {

	public CurrentClassConstructor() {
		System.out.println("current class no-arg constructor");
	}
	
	public CurrentClassConstructor(int num) {
		this();
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		CurrentClassConstructor obj1 = new CurrentClassConstructor(1234);
	}
}
