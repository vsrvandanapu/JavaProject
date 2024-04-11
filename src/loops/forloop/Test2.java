package loops.forloop;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("Printing the odd numbers from 1 to 10");
		System.out.println("----------------------------------");
		for(int num = 1; num <= 10; num++)
		{
			if(num % 2 != 0)
			{
				System.out.println(num);
			}
		
		}

	}

}
