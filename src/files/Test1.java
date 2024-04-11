package files;

import java.io.File;

public class Test1 {

	public static void main(String[] args) {
		File file  = new File("C:\\Users\\A1\\Desktop\\Demo");
		file.mkdir();
		if(file.exists())
		{
			System.out.println("Folder is already existed..");
		}
		else 
		{
			file.mkdir();
		}

	}

}
