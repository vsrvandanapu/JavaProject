package accessmodifiers2;

import accessmodifiers1.ClsOne;

public class ClsFour extends ClsOne{

	public static void main(String[] args) {
		ClsFour fObj = new ClsFour();
		System.out.println("The access specifier 'public' value of A is : " + fObj.a);
//		System.out.println("The access specifier 'private' value of B is : " + fObj.b);
//		System.out.println("The access specifier 'default' value of C is : " + fObj.c);
		System.out.println("The access specifier 'protected' value of D is : " + fObj.d);
		fObj.m1();
//		fObj.m2();
//		fObj.m3();
		fObj.m4();
	}

}
