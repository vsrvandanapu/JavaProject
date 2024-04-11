package oops.abstract3;

public class Car extends Vehicle2 {

	@Override
	public void move() {
		System.out.println("Car is moving");
	}

	@Override
	public void start() {
		System.out.println("Car started");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped");

	}

}
