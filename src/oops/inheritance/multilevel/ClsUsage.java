package oops.inheritance.multilevel;

public class ClsUsage {

	public static void main(String[] args) {

		System.out.println("~~~~~~~Class A~~~~~~~");
		
		A aObj = new A();
		System.out.println("The x value is : " + aObj.x);
		aObj.m1();
		
		System.out.println("~~~~~~~Class B~~~~~~~");
		B bObj = new B();
		System.out.println("The x value is : " + bObj.x);
		System.out.println("The y value is : " + bObj.y);
		bObj.m1();
		bObj.m2();
		System.out.println("~~~~~~~Class C~~~~~~~");
		C cObj = new C();
		System.out.println("The x value is : " + cObj.x);
		System.out.println("The y value is : " + cObj.y);
		System.out.println("The z value is : " + cObj.z);
		cObj.m1();
		cObj.m2();
		cObj.m3();
	}

}
