package core_java_topics.polymorphism.covariantReturnType;

public class A {

	A get(){
		return this;
	}
	
	public void displayMsg() {
		System.out.println("This is an example of covariant return type from class A");
	}
}
