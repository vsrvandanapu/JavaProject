package oops.interface1;

public class ClsUsage {

	public static void main(String[] args) {
//		Vehicle v = new Vehicle();//Cannot instantiate the type Vehicle
		Bike b = new Bike();
		b.start();
		b.stop();
		System.out.println("~~~~~~~~~~");
		Car c = new Car();
		c.start();
		c.start();

	}

}
