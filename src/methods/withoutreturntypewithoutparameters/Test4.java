package methods.withoutreturntypewithoutparameters;

public class Test4 {

	public void m1()
	{
		System.out.println("---------- m1() ----------");
		System.out.println("It is a first user defined method");
	}
	public void m2()
	{
		m1();
		System.out.println("---------- m2() ----------");
		System.out.println("It is a second user defined method");
	}
	public static void main(String[] args) {
		Test4 obj = new Test4();
		obj.m2();

	}

}
