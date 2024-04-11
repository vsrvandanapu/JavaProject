package oops.abstract2;

public class Bike extends Vehicle{

	@Override
	public void start() {
		System.out.println("Bike started..");
	}

	@Override
	void stop() {
		System.out.println("Bike stopped..");
	}

}
