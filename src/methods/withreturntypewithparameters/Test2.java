package methods.withreturntypewithparameters;

public class Test2 {
	// instance variable
	int i;
	//int i; -> duplicate variable.
	// user defined methods
	public int add(int a, int b)// local variables
	{
		int result;
		result = a + b;
		return result;
		
	}

	public double subtract(double a, double b)
	{
		double result = a - b;
		return result;
	}
	public boolean isEven(int num)
	{
		if(num % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Test2 obj = new Test2();
		System.out.println("Addition of two integers : " + obj.add(10,20));
		System.out.println("Subtraction of two integers : " + obj.subtract(20.2, 5.1));
		System.out.println("Even number status : " + obj.isEven(5));
		System.out.println("Even number status : " + obj.isEven(50));
	}

}
