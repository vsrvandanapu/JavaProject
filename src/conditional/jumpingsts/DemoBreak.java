package conditional.jumpingsts;

public class DemoBreak {

	public static void main(String[] args) {
		// Printing the numbers from 1 to 10 when the value is 6
		for(int i = 1; i <= 10; i++)
		{
			if(i == 8) 
			{
				
				break;
			}
			System.out.println(i);
		}
	}

}
