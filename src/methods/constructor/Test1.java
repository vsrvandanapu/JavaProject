package methods.constructor;

public class Test1 {
	// constructor
	Test1() {
		System.out.println("----------default cosntructor----------");
		System.out.println("It is a constructor");
		System.out.println("Object is created...");
	}
	// user defined - void method
	public void m1() {
		System.out.println("----------m1()----------");
		System.out.println("It is a void method..");
	}
	// user defined -non void method
	public int m2() {
		System.out.println("----------m2()----------");
		System.out.println("It is a non void method..");
		int a = 100;
		return a;
	}
	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.m1();
		obj.m2();

	}

}
