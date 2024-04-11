package arrays.one;

public class Test5 {

	public static void main(String[] args) {
		
		 Object [] arr = new Object [5]; // define the array size
		 
		 arr[0] = 10;
		 arr[1] = 20.5;
		 arr[2] = "swati";
		 arr[3] = true;
		 arr[4] = 50;
		 System.out.println("The array length is : " + arr.length);
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
