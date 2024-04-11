package oops.abstract3;

public abstract class Vehicle1 {

	// abstract methods
	public abstract void start();

	public abstract void stop();
	
	public static void main(String[] args) {
		/* 
		To create an object : 
		AbstractClassName refVariable = new ClassName();
		*/
		//Vehicle2 obj = new Vehicle2();
		Vehicle2 v = new Bike();
		v.start();
		v.move();
		v.stop();
		System.out.println("~~~~~~~~~~~~~~");
		Vehicle2 c = new Car();
		c.start();
		c.move();
		c.stop();
		
		

	}

}