package primitivedatatypes;

public class TestShort {

	public static void main(String[] args) {
		// short - 2 bytes (-32768 to +32767)
		short a;
		a=128;
		System.out.println("The A value is : "+ a);
		short b = 32767;
		System.out.println("The B value is : "+ b);
		System.out.println("The short min value is : " + Short.MIN_VALUE);
		System.out.println("The short max value is : " + Short.MAX_VALUE);
	}

}
