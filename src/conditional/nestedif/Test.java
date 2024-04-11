package conditional.nestedif;

public class Test {

	public static void main(String[] args) {
		
		int a = 1000, b =200, c=30;
		if(a > b)
		{
			if(a > c)
			{
				System.out.println("Big number is : " + a);
			}
			
		}else if(b > c) 
		{
			System.out.println("Big number is : " + b);
		}
		else
		{
			System.out.println("Big number is : " + c);
		}
	}

}

