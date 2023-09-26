package core_java_topics.constructor.defaultConstructor;

public class FeaturedCDAccount {

	// no-arg/default constructor
	// constructor name must be same as a class name
	// constructor must not have any return-type, not even void
	// it can't be abstract or static
	public FeaturedCDAccount() {
		System.out.println("This is no-arg/default constuctor...");
	}
	
	public void displayInfo() {
		System.out.println("This is a method...........");
	}
	public void FeaturedCDAccount() {
		System.out.println("this is also method but with the same class name..........");
	}
	public static void main(String[] args) {
		FeaturedCDAccount account = new FeaturedCDAccount();
		//account.displayInfo();
	}
}
