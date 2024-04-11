package oops.interface2;

public class Bike implements Vehicle1, Vehicle2{

	@Override
	public void move() {
		System.out.println("Bike is moving..");
	}

	@Override
	public void start() {
		System.out.println("Bike started..");
	}

	@Override
	public void stop() {
		System.out.println("Bike stopped..");
	}

}
