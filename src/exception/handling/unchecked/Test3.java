package exception.handling.unchecked;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("Starting");
		String str=null; 
		try {
			System.out.println(str.length());
		}
		
		catch(ArithmeticException ae) {
			System.out.println("Execption is handled..");
		}
		catch(ArrayIndexOutOfBoundsException ne) {
			System.out.println(ne.getMessage());
		}
		catch(Exception ae) {
			System.out.println("--Execption is handled..");
		}
		System.out.println("Ending");

	}
/*
 Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
	at exception.handling.unchecked.Test3.main(Test3.java:8)
 */
}
