package keywords3;

public class Demo extends Test {
	//If you make any method as final, you cannot override it.
	//Cannot override the final method from Test
	/*
	public void display() {
		System.out.println("---------display()---------");
		System.out.println("It is a Demo class Method");
	}
	 */
	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
	}
}
