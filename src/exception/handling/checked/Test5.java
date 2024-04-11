package exception.handling.checked;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test5 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Begining");
		File f = new File("C:\\Users\\A1\\Desktop\\Data.txt");
		FileReader fr = new FileReader(f);
		int ch;
		while((ch = fr.read()) != -1)
		{
			System.out.print((char)ch);
		}
		Thread.sleep(3000);
		System.out.println();
		Thread.sleep(3000);
		System.out.println("Ending");
		fr.close();

	}

}
