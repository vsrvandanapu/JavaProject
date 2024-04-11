package arrays.two;

public class Test3 {

	public static void main(String[] args) {
		/*
		 Syntax 2:
		 datatype arrayName [][]= new datatype [noOfRows][noOfCols];
		 		or 
		 datatype [][] arrayName = new datatype [noOfRows][noOfCols];
		 */
		char carr [][] = new char [3][2];
		carr[0][0] = 'A';
		carr[0][1] = 'B';
		carr[1][0] = 'C';
		carr[1][1] = 'D';
		carr[2][0] = 'E';
		carr[2][1] = 'F';
		
		System.out.println("The char array total rows : " + carr.length);
		System.out.println("The char array total cols : " + carr[0].length);
		for(int rowNo = 0; rowNo < carr.length; rowNo++)
		{
			for(int colNo = 0; colNo < carr[rowNo].length; colNo++)
			{
				System.out.print(carr[rowNo][colNo] + " ");
			}
			System.out.println();
		}

	}

}
