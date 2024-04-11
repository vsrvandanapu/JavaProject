package arrays.two;

public class Test4 {

	public static void main(String[] args) {
		/*
		 Syntax 3:
		 datatype arrayName []  = {
		 								{val1, val2, ...},
		 								{val1, val2,...}
		 								...........
		 						 };
	
		 
		 */
		String [][] tools = {
								{"Selenium  ","Jmeter    "},
								{"QTP       ","LoadRunner"},
								{"RFT       ","RPT       "}
		                     };
		System.out.println("The string array total rows : " + tools.length);
		System.out.println("The string array total cols : " + tools[0].length);
		
		for(int i = 0; i < tools.length; i++)
		{
			for(int j = 0; j < tools[i].length; j++)
			{
				System.out.print(tools[i][j] + " ");
			}
			System.out.println();
		}
	}

}
