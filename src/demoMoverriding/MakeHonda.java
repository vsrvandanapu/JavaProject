package demoMoverriding;

public class MakeHonda extends Vehicle {

	public void start(int speed, String color) {
		System.out.println("Self start to the bike");
		System.out.println("Speed : " + speed);
		System.out.println("Color : " + color);
	}
	public static void main(String[] args) {
		MakeHonda m = new MakeHonda();
		m.start(100, "RED");
	}
}
