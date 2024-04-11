package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test7 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\A1\\Desktop\\Demo.txt");
		FileInputStream fis = new FileInputStream(f);
		//System.out.println((char)fis.read());
		int ch;
		while((ch = fis.read()) != -1)
		{
			System.out.print((char)ch);
		}
		fis.close();

	}

}
