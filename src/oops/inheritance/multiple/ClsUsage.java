package oops.inheritance.multiple;

public class ClsUsage {

	public static void main(String[] args) {

		System.out.println("~~~~~~~Class A~~~~~~~");
		
		A aObj = new A();
		System.out.println("The x value is : " + aObj.x);
		aObj.m1();
		
		System.out.println("~~~~~~~Class B~~~~~~~");
		B bObj = new B();
//		System.out.println("The x value is : " + bObj.x);
		System.out.println("The y value is : " + bObj.y);
//		bObj.m1();
		bObj.m2();
//		System.out.println("~~~~~~~Class C~~~~~~~");
//		C cObj = new C();
	}

}
