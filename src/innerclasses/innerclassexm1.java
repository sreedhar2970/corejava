package innerclasses;

public class innerclassexm1 {

	class inner2{
		public void methodone() {
			System.out.println("it is the inner method");
		}
	}
	public static void main(String[] args) {
		new innerclassexm1().new inner2().methodone();
	}
}
