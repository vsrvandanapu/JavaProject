package oops.abstract2;

public class ClsUsage {

	public static void main(String[] args) {
//		Vehicle vObj = new Vehicle(); //Cannot instantiate the type Vehicle
		Bike b = new Bike();
		b.start();
		b.stop();
		b.buildDate();
		System.out.println("~~~~~~~~~~~~~~~~");
		Car c = new Car();
		c.start();
		c.stop();
		c.buildDate();
	}

}
