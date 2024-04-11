package conditional.jumpingsts;

public class DemoContinue {

	public static void main(String[] args) {
		// Printing the numbers from 1 to 10 except 3 and 6
		for(int i = 1; i <= 10; i++)
		{
			if(i == 3  || i == 6)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
