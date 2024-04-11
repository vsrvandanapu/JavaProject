package loops.foreachloop;

public class Test2 {

	public static void main(String[] args) {
		char vowels [] = new char [5];
		vowels [0] = 'A';
		vowels [1] = 'E';
		vowels [2] = 'I';
		vowels [3] = 'O';
		vowels [4] = 'U';
		 System.out.println("~~~~~~~~for each loop~~~~~~~~~");
		 for (char val : vowels) {
			 System.out.println(val);
		}
		 
		 System.out.println("~~~~~~~~for loop~~~~~~~~~");
		System.out.println("The character array size is : " + vowels.length);
		for(int i = 0; i < vowels.length; i++)
		{
			System.out.println(vowels[i]);
		}

	}

}
