package methods.withoutreturntypewithparameters;

public class Test1 {

	public void val(int a)
	{
		
		System.out.println("The value is : " + a);
	}
	
	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.val(10);
		obj.val(20);
		obj.val(30);
		obj.val(40);
		obj.val(100);

	}

}
