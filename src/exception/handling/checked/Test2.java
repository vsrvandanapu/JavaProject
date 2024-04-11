package exception.handling.checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("Begining");
		File f = new File("C:\\Users\\A1\\Desktop\\Data.txt");
		FileReader fr = null;
		try {
			fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int ch;
		try {
			while((ch = fr.read()) != -1)
			{
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("Ending");
		try {
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
