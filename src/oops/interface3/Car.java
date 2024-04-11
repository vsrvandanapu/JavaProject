package oops.interface3;

public class Car implements Vehicle2{

	@Override
	public void start() {
		System.out.println("Car started..");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped..");
		
	}

	@Override
	public void move() {
		System.out.println("Car is moving..");
	}

}
