package files;

import java.io.File;
import java.io.IOException;

public class Test5 {
	public static void main(String[] args) throws IOException {
		File file  = new File("C:\\Users\\A1\\Desktop\\Demo.txt");
		if(file.exists()) 
		{
			System.out.println("File already existed..");
		}
		else
		{
			file.createNewFile();
		}
	}

}
