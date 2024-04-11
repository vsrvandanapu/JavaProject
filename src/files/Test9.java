package files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test9 {

	public static void main(String[] args) throws IOException {
		/*
		 File f = new File("C:\\Users\\A1\\Desktop\\Demo.txt");
		FileReader fr = new FileReader(f);
		 */
		FileReader fr = new FileReader(new File("C:\\Users\\A1\\Desktop\\Demo.txt"));
		int ch;
		String text = "";
		while((ch = fr.read()) != -1)
		{
			text = text + String.valueOf((char)ch);
			//System.out.print((char)ch);
		}
		System.out.println(text);
		fr.close();

	}

}
