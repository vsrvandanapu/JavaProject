package exception.handling.unchecked;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("Starting");
		int arr[];
		try {
			arr = new int [-5];
			arr[2] = 20;
			System.out.println(arr[2]);
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Ending");

	}
/*
Exception in thread "main" java.lang.NegativeArraySizeException: -5
	at exception.handling.unchecked.Test4.main(Test4.java:7)

 */
}
