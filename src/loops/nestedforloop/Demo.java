package loops.nestedforloop;

public class Demo {

	public static void main(String[] args) {
		int table = 1;
		System.out.println("Printing the Maths Table " + table);
		System.out.println("---------------------------------");
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i + " * " + table + " = " + (table*i));
		}
		
		table = 2;
		System.out.println("Printing the Maths Table " + table);
		System.out.println("---------------------------------");
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i + " * " + table + " = " + (table*i));
		}
		table = 3;
		System.out.println("Printing the Maths Table " + table);
		System.out.println("---------------------------------");
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i + " * " + table + " = " + (table*i));
		}
	}

}
