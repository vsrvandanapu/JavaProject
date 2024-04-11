package methods.withoutreturntypewithparameters;

public class Test2 {
	
	public void addition(int x, int y) {
		int result = x+y;
		System.out.println("Addition of two integers is : " + result);
	}

	public static void main(String[] args) {
		Test2 obj = new Test2();
		obj.addition(10, 20);

	}

}
