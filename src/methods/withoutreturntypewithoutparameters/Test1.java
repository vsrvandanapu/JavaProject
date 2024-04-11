package methods.withoutreturntypewithoutparameters;

public class Test1 {
	//Method without returntype and without parameters
	
	public void m1()
	{
		System.out.println("---------- m1() ----------");
		System.out.println("It is a first user defined method");
	}

	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.m1();
		obj.m1();
		obj.m1();
		obj.m1();
	}

}
