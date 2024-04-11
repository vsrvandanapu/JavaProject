package accessmodifiers2;

import accessmodifiers1.ClsOne;

public class ClsThree {

	public static void main(String[] args) {
		ClsOne obj = new ClsOne();
		System.out.println("The access specifier 'public' value of A is : " + obj.a);
//		System.out.println("The access specifier 'private' value of B is : " + obj.b);
//		System.out.println("The access specifier 'default' value of C is : " + obj.c);
//		System.out.println("The access specifier 'protected' value of D is : " + obj.d);
		obj.m1();
//		obj.m2();
//		obj.m3();
//		obj.m4();
	}

}
