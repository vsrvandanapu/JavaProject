package exception.handling.unchecked;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("Starting");
		int arr [] = new int [5];
		arr[2] = 20;
		try {
			System.out.println(arr[5]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Ending");
	}
/*
 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at exception.handling.unchecked.Test2.main(Test2.java:9)
 */
}
