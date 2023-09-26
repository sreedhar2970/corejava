package core_java_topics.abstraction.basicExm;

public class B extends A{

	@Override
	public void method2() {
		System.out.println("This is method2() of class B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.method1();
		b.method2();
		b.method3();
		b.method4();
	}
	
}
