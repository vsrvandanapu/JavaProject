package methods.withreturntypewithoutparameters;

public class Test2 {
	

	public int val()
	{
		int a = 5;
		return a;
	}
	public static void main(String[] args) {
		Test2 obj = new Test2();
		//int x = obj.val();
		System.out.println("The integer value is : " + obj.val());

	}

}
