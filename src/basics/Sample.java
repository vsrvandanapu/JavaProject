package basics;

public class Sample {

	// user defined method
	public void m1() {
		System.out.println("It is a m1() method under basics package");
	}
	public static void main(String[] args) {
		Sample obj=new Sample();
		System.out.println("Welecome to Java");
		obj.m1();
	}

}
