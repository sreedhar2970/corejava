package innerclasses;

public class outer2 {

	int x=10;
	class inner{
		int x=100;
		public void methodone() {
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(outer2.this.x);
		}
	}
	public static void main(String[] args) {
		new outer2().new inner().methodone();
	}
}
