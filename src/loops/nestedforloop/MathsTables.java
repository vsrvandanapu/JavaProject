package loops.nestedforloop;

public class MathsTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Printing Maths tables from 1 to 10");
		System.out.println("----------------------------------");
		for(int table = 1; table <= 10; table++)// outer for loop
		{
			System.out.println("Printing the Maths table : " + table);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			for(int i = 1; i <= 10; i++)
			{
				System.out.println(i + " * " + table + " = " + (table * i));
			}
			System.out.println("##################################");
			
		}
	}

}
