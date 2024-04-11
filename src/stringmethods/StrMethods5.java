package stringmethods;

public class StrMethods5 {

	public static void main(String[] args) {
		System.out.println("-----------split()----------");
		String val = "This is a test";
		System.out.println(val);
//		System.out.println(val.split(" "));
//		int a=20;
		String [] splitValue = val.split(" ");
		System.out.println("The string array size is : " + splitValue.length);
		for (String str : splitValue) {
			System.out.println(str);
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^^^");
		String [] strArray = val.split("s");
		System.out.println("The string array size is : " + splitValue.length);
		for (String arrVal : strArray) {
			System.out.println(arrVal);
		}
		System.out.println("-----------toCharArray()----------");
		String name = "MadhuSmitha";
		char [] charArray = name.toCharArray();
		for(int i =0; i < charArray.length; i++)
		{
			System.out.println(charArray[i]);
		}
	}

}
