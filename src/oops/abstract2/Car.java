package oops.abstract2;

public class Car extends Vehicle {

	@Override
	public void start() {
		System.out.println("Car started..");
	}

	@Override
	void stop() {
		System.out.println("Car stopped..");
	}

}
