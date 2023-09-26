package core_java_topics.polymorphism.problem;

public class B extends A{

	public void m() {
		System.out.println("This is specific to child class B m() method....");
	}
	public static void main(String[] args) {
		
		//B b = new B();
		//A a = new A();
//		B b;
//		b.m();
		A a = new A();
		A a1 = new B();
		a1.m();
		a.m();
	}
}
