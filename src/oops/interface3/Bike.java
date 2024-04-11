package oops.interface3;

public class Bike implements Vehicle2 {

	@Override
	public void start() {
		System.out.println("Bike started..");
	}

	@Override
	public void stop() {
		System.out.println("Bike stopped..");
	}

	@Override
	public void move() {
		System.out.println("Bike is moving..");
	}

}
