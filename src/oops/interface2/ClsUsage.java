package oops.interface2;

public class ClsUsage {

	public static void main(String[] args) {

		Bike b = new Bike();
		b.start();
		b.move();
		b.stop();
		System.out.println("~~~~~~~~~~~~~");
		Car c = new Car();
		c.start();
		c.move();
		c.stop();
	}

}
