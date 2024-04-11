package wrapperclasses;

public class Demo1 {

	public static void main(String[] args) {
		String  s[] = {"10", "20"};
		System.out.println("Sum before:"+ s[0] + s[1]); // 1020

		int x=Integer.parseInt(s[0]); // convert String to Integer
		int y=Integer.parseInt(s[1]); // convert String to Integer
		int z=x+y;
		System.out.println("sum after: "+z); 
		String m = "20";
		Integer i1 = new Integer(m);
		System.out.println(i1); //20
		Integer i2 = new Integer(50);
		System.out.println(i2);//50
		String n = "100";
		Integer i3 = Integer.parseInt(n);
		System.out.println(i3);//100
		System.out.println(i1+i2+i3); //170
//		Integer i4 = new Integer("abc");
//		System.out.println(i4);//

	}
/*
 Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.<init>(Integer.java:1127)
	at wrapperclasses.Demo1.main(Demo1.java:22)
 */
}
