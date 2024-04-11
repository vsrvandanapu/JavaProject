package oops.abstract2;

public abstract class Vehicle {
	public Vehicle() {
		System.out.println("It is a default constructor");
	}
	// abstract methods
	public abstract void start();
	abstract void stop();
	
	//concrete methods
	public void buildDate()
	{
		System.out.println("Today is the build signoff...");
	}

}
