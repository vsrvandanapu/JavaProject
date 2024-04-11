package exception.handling.unchecked;

public class Test1 {
// Exception doesn't occur
	public static void main(String[] args) {
		System.out.println("Starting");
		int n = 10;
		try {
			System.out.println(n/2);
		}
		catch(ArithmeticException ae) {
			System.out.println("Execption is handled..");
		}
		finally{
			System.out.println("Executing the finally block");
		}
		
		System.out.println("Ending");

	}
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exception.handling.unchecked.Test1.main(Test1.java:8)

 */
}
