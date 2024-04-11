package arrays.one;

public class Test4 {

	public static void main(String[] args) {
		/*
		 Syntax 3:
		 datatype arrayName []  = {val1, val2, val3, val4,...};
		 				or
		 datatype [] arrayName   = {val1, val2, val3, val4,...};
		 */
		 String [] tools = {"Selenium", "QTP", "SilkTest", "RFT", "CodedUI", "Cypress", "PlayWrite", "JMeter", "LoadRuner", "RPT"};
		 System.out.println("The string array size is : " + tools.length);
		 for(int j = 0; j < tools.length; j++)
		 {
			 System.out.println(tools[j]);
		 }
	}

}
