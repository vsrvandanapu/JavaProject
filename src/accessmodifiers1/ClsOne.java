package accessmodifiers1;

public class ClsOne {

	// Access Modifers								Scope
	public int a = 10;     			// public ->   Entire Project
	private int b = 20;				// private -> with in the class
	int c = 30;						// default -> with in the package
	protected int d = 40;			// protected -> with in the package & another package - Inheritance
	public void m1() {
		System.out.println("---------m1()---------");
		System.out.println("It is access specifier - 'public' method");
	}
	private void m2() {
		System.out.println("---------m2()---------");
		System.out.println("It is access specifier - 'private' method");
	}
	void m3() {
		System.out.println("---------m3()---------");
		System.out.println("It is access specifier - 'default' method");
	}
	protected void m4() {
		System.out.println("---------m4()---------");
		System.out.println("It is access specifier - 'protected' method");
	}
	public static void main(String[] args) {
		ClsOne obj = new ClsOne();
		System.out.println("The access specifier 'public' value of A is : " + obj.a);
		System.out.println("The access specifier 'private' value of B is : " + obj.b);
		System.out.println("The access specifier 'default' value of C is : " + obj.c);
		System.out.println("The access specifier 'protected' value of D is : " + obj.d);
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}

}
