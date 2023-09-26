package core_java_topics.polymorphism.basicExm;

public class BikeExm1 {

	public static void main(String[] args) {
		Bike bike = new Bike();
		Bike honda = new HondaActiva();
		Bike splendor = new Splendor();
		
		bike.run();
		honda.run();
		splendor.run();
	}

}
