package methods.withreturntypewithparameters;

public class Test1 {
	
	public int val(int a) {
		return a;
		//System.out.println("HI");
	}

	public static void main(String[] args) {
		Test1 obj = new Test1();
		int x = obj.val(10);
		System.out.println("The integer value is : " + x);
		System.out.println("The integer value is : " + obj.val(20));
		System.out.println("The integer value is : " + obj.val(30));
		System.out.println("The integer value is : " + obj.val(40));
		System.out.println("The integer value is : " + obj.val(60));
	}

}
