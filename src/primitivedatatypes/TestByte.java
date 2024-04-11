package primitivedatatypes;

public class TestByte {

	public static void main(String[] args) {
		/*
		 byte - 1 byte - (-128 to +127)
		 Syntax 1:
		 Datatype variableName;
		 variableName = value;
		 */
		byte a; // variable declaration
		a=10; // Assigning the value to variable
		System.out.println(a);
		System.out.println("The A value is : " + a);
		/*
		 Syntax 2:
		 Datatype variableName = value;
		 */
		byte b = -128;
		System.out.println("The B value is : " + b);
		System.out.println("The byte min value is : " +  Byte.MIN_VALUE);
		System.out.println("The byte max value is : " +  Byte.MAX_VALUE);

	}

}
