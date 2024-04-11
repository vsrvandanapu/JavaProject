package keywords3;

public class Test {
	// instance variables
	int m = 55;
	final int n = 210;
	public void show() {
		m = 100;
		System.out.println("The M value is : " + m);
		//n = 230; // The final field Test.n cannot be assigned
		System.out.println("The N value is : " + n);
	}
	public final void display() {
		System.out.println("---------display()---------");
		System.out.println("It is a Test class Method");
	}
	public static void main(String[] args) {
		// local variable
		int a = 10, b = 20, result;
		result = a + b;
		System.out.println("Result : " + result); //30
		a = 100;
		result = a + b;
		System.out.println("Result : " + result); //120
		b = 200;
		result = a + b;
		System.out.println("Result : " + result); // 300
		int x = 50, sum;
		final int y = 150;
		sum = x + y;
		System.out.println("Sum : " + sum); // 200
		x = 1000;
		sum = x + y;
		System.out.println("Sum : " + sum); //1150
		//y = 300;
		//The final local variable y cannot be assigned. It must be blank and not using a compound assignment
		sum = x + y;
		System.out.println("Sum : " + sum);
		Test t = new Test();
		t.show();
		t.display();
	}

}
