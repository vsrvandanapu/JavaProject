package methods.withreturntypewithoutparameters;

public class Test3 {

	public int val()
	{
		int a = 5;
		return a;
	}
	public static void main(String[] args) {
		Test3 obj = new Test3();
		int x = obj.val();
		int y = 20, result;
		result = x+ y;
		System.out.println("The result is : " + result);

	}

}
