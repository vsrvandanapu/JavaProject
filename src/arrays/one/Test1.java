package arrays.one;

public class Test1 {

	public static void main(String[] args) {
		/*
		 Syntax 1:
		 datatype arrayName [];
		 arrayName = new datatype [arraysize];
		 */
		 int arr[]; //array declaration
		 arr = new int [5]; // define the array size
		 
		 /*
		  To assign values to an array:
		  ------------------------------
		  arrayName[indexNo] = value;
		  */
		 arr[0] = 10;
		 arr[1] = 20;
		 arr[2] = 30;
		 arr[3] = 40;
		 arr[4] = 50;
		// arr[5] = 60;
		 /*
		  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
		     Index 5 out of bounds for length 5
		at arrays.one.Test1.main(Test1.java:24)
		  */
		 /*
		  To retrieve thh  values from an array:
		  ------------------------------
		  arrayName[indexNo] = value;
		  */
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 System.out.println(arr[2]);
		 System.out.println(arr[3]);
		 System.out.println(arr[4]);
		
	}


}
