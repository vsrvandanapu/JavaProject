package exception.handling.checked;

import java.io.*;

public class Test1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Begining");
		File f = new File("C:\\Users\\A1\\Desktop\\Data.txt");
		FileReader fr = new FileReader(f);
		int ch;
		while((ch = fr.read()) != -1)
		{
			System.out.print((char)ch);
		}
		System.out.println();
		System.out.println("Ending");
		fr.close();

	}

}
