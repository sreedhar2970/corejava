package Abstractionpractice;

public abstract class Yamaha implements Bike{

	@Override
	public void run() {
		System.out.println("bike running safely");
		
	}

	@Override
	public void changegear() {
		System.out.println("please change the gear based in the route");
		
	}
}
