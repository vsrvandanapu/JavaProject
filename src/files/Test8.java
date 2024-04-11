package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\A1\\Desktop\\Demo.txt");
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		sc.close();

	}

}
