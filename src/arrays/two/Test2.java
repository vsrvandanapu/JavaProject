package arrays.two;

public class Test2 {

	public static void main(String[] args) {
		/*
		 Syntax 1:
		 datatype arrayName [][]; 
		 		or 
		 datatype [][]arrayName ;
		 arrayName = new datatype [noOfRows][noOfCols];
		 */
		int arr [][];
		arr = new int [2][3];
		 /*
		  To assign values to an array:
		  ------------------------------
		  arrayName[rowNo][colNo] = value;
		  */
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		System.out.println("Total rows : " + arr.length);
		System.out.println("In First row Total cols : " + arr[0].length);
		//System.out.println("In Second row Total cols : " + arr[1].length);
		 /*
		  To retrieve thh  values from an array:
		  ------------------------------
		  arrayName[rowNo][colNo] = value;
		  */
		
		for(int rowNo=0; rowNo < arr.length; rowNo++)
		{
			
			for(int colNo=0; colNo < arr[rowNo].length; colNo++)
			{
				
				System.out.print(arr[rowNo][colNo] + " ");
			}
			
			System.out.println();
		}
	}

}
