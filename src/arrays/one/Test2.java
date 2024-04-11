package arrays.one;

public class Test2 {

	public static void main(String[] args) {
		/*
		 Syntax 1:
		 datatype [] arrayName ;
		 arrayName = new datatype [arraysize];
		 */
		 int [] arr; //array declaration
		 arr = new int [5]; // define the array size
		 
		 arr[0] = 10;
		 arr[1] = 20;
		 arr[2] = 30;
		 arr[3] = 40;
		 arr[4] = 50;
		 System.out.println("The array length is : " + arr.length);
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
