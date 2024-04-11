package methods.withreturntypewithoutparameters;

public class Test1 {
	
	/*
	 public void val()
	{
		int a = 5;
		System.out.println("The value is : " + a);
	}
	 */
	public int val()
	{
		int a = 5;
		return a;
	}
	public static void main(String[] args) {
		Test1 obj = new Test1();
		int x = obj.val();
		System.out.println("The integer value is : " + x);

	}

}
