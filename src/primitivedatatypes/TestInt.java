package primitivedatatypes;

public class TestInt {

	public static void main(String[] args) {
		// int - 4 bytes(-2147483648 to +2147483647)
		/*
		int a ;
		int b;
		*/
		int a, b;
		a= 32768;
		
		b=-2147483648;
		
		System.out.println("The A value is : "+ a);
		System.out.println("The B value is : "+ b);
		System.out.println("The int min value : " +Integer.MIN_VALUE);
		System.out.println("The int max value : " +Integer.MAX_VALUE);

	}

}
