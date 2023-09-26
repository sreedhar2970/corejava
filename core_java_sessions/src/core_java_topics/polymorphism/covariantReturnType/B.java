package core_java_topics.polymorphism.covariantReturnType;

public class B extends A{

	B get(){
		return this;
	}
	public void displayMsg() {
		System.out.println("This is an example of covariant return type from class B");
	}
}
