package methods.withoutreturntypewithoutparameters;

public class Test2 {

	public void m1()
	{
		System.out.println("---------- m1() ----------");
		System.out.println("It is a first user defined method");
	}
	public void m2()
	{
		System.out.println("---------- m2() ----------");
		System.out.println("It is a second user defined method");
	}
	public static void main(String[] args) {
		Test2 obj = new Test2();
		obj.m1();
		obj.m2();

	}

}
