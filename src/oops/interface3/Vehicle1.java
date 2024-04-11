package oops.interface3;

public interface Vehicle1 {
//Interfaces cannot have constructors
	/*
	public Vehicle1() {
		
	}
	*/
	// public static final variables
	public static final String COURSE_NAME = "Selenium";
	int COURSE_DURATION = 45;
	
	// public abstract methods
	public abstract void start();

	public void stop();
}
