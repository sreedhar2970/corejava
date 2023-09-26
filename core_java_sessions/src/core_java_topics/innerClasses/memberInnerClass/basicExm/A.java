package core_java_topics.innerClasses.memberInnerClass.basicExm;

public class A {

	private long number = 46576388448l;
	private String name = "Mohammed Kamran";
	
	class B{
		public void display() {
			System.out.println("This is member inner class exm");
			System.out.println("Number : " + number);
			System.out.println("Name : " + name);
			System.out.println("==========================================");
		}
	}
	public void method2() {
		System.out.println("This is the method2() of outer class A......");
	   
	}
	
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.display();
		a.method2();
	}
}
