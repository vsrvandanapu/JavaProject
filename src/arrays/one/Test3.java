package arrays.one;

public class Test3 {

	public static void main(String[] args) {
		/*
		 Syntax 2:
		 datatype arrayName []  = new datatype [arraysize];
		 				or
		 datatype [] arrayName   = new datatype [arraysize];
		 */
		char vowels [] = new char [5];
		vowels [0] = 'A';
		vowels [1] = 'E';
		vowels [2] = 'I';
		vowels [3] = 'O';
		vowels [4] = 'U';
		System.out.println("The character array size is : " + vowels.length);
		for(int i = 0; i < vowels.length; i++)
		{
			System.out.println(vowels[i]);
		}
	}

}
