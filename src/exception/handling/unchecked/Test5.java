package exception.handling.unchecked;

public class Test5 {

	public static void main(String[] args) {
		System.out.println("Starting");
		String str1= "abc";
		try {
			System.out.println(Integer.parseInt(str1));
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (NumberFormatException e) {
			System.out.println("Exception is handled..........");
		}
		System.out.println("Ending");

	}
/*
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.parseInt(Integer.java:786)
	at exception.handling.unchecked.Test5.main(Test5.java:8)
 */
/*
 		String str1 = "12";
		String str2 = "20";
		System.out.println(str1+str2);
		System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));
 */
}
