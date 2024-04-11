package oops.abstract3;

public class Bike extends Vehicle2{

	@Override
	public void move() {
		System.out.println("Bike is moving");
	}

	@Override
	public void start() {
		System.out.println("Bike started");
	}

	@Override
	public void stop() {
		System.out.println("Bike stopped");
	}

}
