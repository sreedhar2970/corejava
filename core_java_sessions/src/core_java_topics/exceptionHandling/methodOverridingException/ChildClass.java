package core_java_topics.exceptionHandling.methodOverridingException;

public class ChildClass extends ParentClass{

	public void someMethod() throws NullPointerException{
		System.out.println("This is a child class method()");
	}
	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		child.someMethod();
	}
}
