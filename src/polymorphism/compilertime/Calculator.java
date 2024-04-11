package polymorphism.compilertime;

public class Calculator {

	public void add(int a, int b) {
		int result = a + b;
		System.out.println("Addition of two integers is : " + result);
	}
	
	public void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println("Addition of three integers is : " + result);
	}
	
	public void add(int a, double b) {
		double result = a + b;
		System.out.println("Addition of integer and double is : " + result);
	}
	
	public void add(double a, int b) {
		double result = a + b;
		System.out.println("Addition of double and integer is : " + result);
	}
	
	public void add(double a, double b) {
		double result = a + b;
		System.out.println("Addition of two doubles is : " + result);
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(10, 20);
		cal.add(20, 30, 40);
		cal.add(10, 1.2);
		cal.add(2.3, 20);
		cal.add(1.3, 2.2);

	}

}
