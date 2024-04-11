package polymorphism.runtime;

public class MakeHonda extends Vehicle{
	//Method Overriding
	public void start() {
		System.out.println("----------start()----------");
		System.out.println("It is a MakeHonda class method..");
		System.out.println("Self start to the bike..");
	}
	// Method overhiding
	public static void print() {
		System.out.println("-----------print()-----------");
		System.out.println("It is a MakeHonda class static method..");
	}
	public static void main(String[] args) {
		MakeHonda honda = new MakeHonda();
		honda.start();
		MakeHonda.print();

	}

}
