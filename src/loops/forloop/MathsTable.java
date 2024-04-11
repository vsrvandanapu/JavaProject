package loops.forloop;

public class MathsTable {
/*
 1 * 3 = 3
 2 * 3 = 6
 ..........
 10 * 3 = 30
 */
	public static void main(String[] args) {
		int table = 3;
		System.out.println("Printing the Maths Table " + table);
		System.out.println("---------------------------------");
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i + " * " + table + " = " + (table*i));
		}

	}

}
