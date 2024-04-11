package arrays.two;

public class Test1 {

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
		 /*
		  To retrieve thh  values from an array:
		  ------------------------------
		  arrayName[rowNo][colNo] = value;
		  */
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
	}

}
