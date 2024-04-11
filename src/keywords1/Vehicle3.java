package keywords1;

public class Vehicle3 {

	public Vehicle3(){
		System.out.println("---------default constructor---------");
		System.out.println("Vehicle object is created...");
	}
	public Vehicle3(int speed){
		System.out.println("---------one arg constructor---------");
		System.out.println("Vehicle speed : "+ speed);
	}
	public Vehicle3(String color, int milage){
		System.out.println("---------two arg constructor---------");
		System.out.println("Vehicle color : "+ color);
		System.out.println("Vehicle Milage : "+ milage);
	}
	public static void main(String[] args) {
//		Vehicle3 v1 = new Vehicle3();
//		Vehicle3 v2 = new Vehicle3(100);
		Vehicle3 v3 = new Vehicle3("Blue", 60);
		

	}

}
