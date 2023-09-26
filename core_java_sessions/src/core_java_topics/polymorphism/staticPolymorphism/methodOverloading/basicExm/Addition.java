package core_java_topics.polymorphism.staticPolymorphism.methodOverloading.basicExm;

public class Addition {

	static int add(int a, int b) {
		return a+b;
	}
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println("Addition of 2 numbers : " + Addition.add(10, 20));
		System.out.println("Addition of 3 numbers : " + Addition.add(10, 20, 30));
	}
}
