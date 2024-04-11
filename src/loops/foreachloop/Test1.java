package loops.foreachloop;

public class Test1 {

	public static void main(String[] args) {
		 int [] arr; //array declaration
		 arr = new int [5]; // define the array size
		 
		 arr[0] = 10;
		 arr[1] = 20;
		 arr[2] = 30;
		 arr[3] = 40;
		 arr[4] = 50;
		 System.out.println("The array length is : " + arr.length);
		 
		 /*
		  for(arrayType variableName : arrayName)
			{
			  System.out.println(variableName);
			}
		  */
		 System.out.println("~~~~~~~~for each loop~~~~~~~~~");
		 for(int val : arr)
		 {
			 System.out.println(val);
		 }
		 System.out.println("~~~~~~~~for loop~~~~~~~~~");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}

	}

}
