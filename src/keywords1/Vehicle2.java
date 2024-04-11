package keywords1;

public class Vehicle2 {

	public Vehicle2(){
		System.out.println("---------default constructor---------");
		System.out.println("Vehicle object is created...");
		
	}
	public Vehicle2(int speed){
		this();
		System.out.println("---------one arg constructor---------");
//		this();//Constructor call must be the first statement in a constructor
		System.out.println("Vehicle speed : "+ speed);
	}
	public Vehicle2(String color, int milage){
		System.out.println("---------two arg constructor---------");
		System.out.println("Vehicle color : "+ color);
		System.out.println("Vehicle Milage : "+ milage);
	}
	public static void main(String[] args) {
		Vehicle2 v = new Vehicle2(100);
		

	}

}
