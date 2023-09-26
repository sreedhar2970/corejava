package core_java_topics.innerClasses.localInnerClass.basicExm;

public class LocalInnerClassExm {

	private int number = 100;
	private String name = "Mohammed Kamran";
	
	public void displayInfo() {
		class LocalInnerClass{
			public void display() {
				System.out.println("Number : " + number);
				System.out.println("Name : " + name);
			}
		}
		LocalInnerClass obj = new LocalInnerClass();
		obj.display();
	}
	public static void main(String[] args) {
		LocalInnerClassExm exm= new LocalInnerClassExm();
		exm.displayInfo();
	}
}
