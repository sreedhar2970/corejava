package Abstractionpractice;

public class yamahar15 extends Yamaha{

	
	@Override
	public void selfmotor() {
		System.out.println("every bike has a self motor");
	}
		
	public static void main(String[] args) {
		yamahar15 r15 = new yamahar15();
		r15.changegear();
		r15.selfmotor();
		r15.run();

	}

}
