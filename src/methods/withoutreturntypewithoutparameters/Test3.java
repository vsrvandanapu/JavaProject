package methods.withoutreturntypewithoutparameters;

public class Test3 {

	public void m1()
	{
		System.out.println("---------- m1() ----------");
		System.out.println("It is a first user defined method");
		//  invoke a method with in a method
		// methodName();
		m2();
	}
	public void m2()
	{
		System.out.println("---------- m2() ----------");
		System.out.println("It is a second user defined method");
	}
	public static void main(String[] args) {
		Test3 obj = new Test3();
		obj.m1();
		

	}

}
