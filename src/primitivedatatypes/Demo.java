package primitivedatatypes;

public class Demo {
	// instance variables or non static variables
	byte a;
	short b;
	int c;
	long d;
	float f;
	double e;
	char val;
	boolean g;
	String str;

	public static void main(String[] args) {
		/*
		 To create an object:
		 ---------------------
		 ClassName objectName = new ClassName();
		 */
		Demo obj = new Demo();
		/*
		 To acess the instance variables:
		 ---------------------
		 objectName.instanceVariable;
		 */
		System.out.println("The 'byte' default value is : "+obj.a);
		System.out.println("The 'short' default value is : "+obj.b);
		System.out.println("The 'int' default value is : "+obj.c);
		System.out.println("The 'long' default value is : "+obj.d);
		System.out.println("The 'float' default value is : "+obj.f);
		System.out.println("The 'double' default value is : "+obj.e);
		System.out.println("The 'char' default value is : "+obj.val);
		System.out.println("The 'boolean' default value is : "+obj.g);
		System.out.println("The 'String' class default value is : "+obj.str);

	}

}
