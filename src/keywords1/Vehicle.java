package keywords1;

public class Vehicle {
//using this() keyword to invoke the current class constructor
	public Vehicle(){
		System.out.println("---------Default Constructor---------");
		System.out.println("Vehicle object is created...");
	}
	public Vehicle(int speed){
		this();
		System.out.println("---------one arg constructor---------");
		System.out.println("Vehicle speed : "+ speed);
	}
	public Vehicle(String color, int milage){
		this(150);
		System.out.println("---------two arg constructor---------");
		System.out.println("Vehicle color : "+ color);
		System.out.println("Vehicle Milage : "+ milage);
	}
	public static void main(String[] args) {
		Vehicle v = new Vehicle("Blue", 60);
		

	}

}
