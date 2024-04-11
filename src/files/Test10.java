package files;

import java.io.*;


public class Test10 {

	public static void main(String[] args) throws IOException {
		// Filewriter
		File f = new File("C:\\Users\\A1\\Desktop\\Demo.txt");
		FileWriter fw = new FileWriter(f);
		fw.write(100);
		fw.write("\n");
		String str = "Hyderabad have metro";
		fw.write(str);
		fw.write("\n");
		char[] ch =str.toCharArray();
		fw.write(ch);
		fw.flush();
		fw.close();

	}

}
