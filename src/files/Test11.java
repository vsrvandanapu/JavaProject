package files;

import java.io.*;


public class Test11 {

	public static void main(String[] args) throws IOException {
		// Filewriter
		FileWriter fw = new FileWriter(new File("C:\\Users\\A1\\Desktop\\Data.txt"));
		fw.write("India");
		fw.write("\n");
		String str1 = "Hyderabad have metro";
		fw.write(str1);
		fw.write("\n");
		String str2 = "Selenium Training Institute";
		char[] ch =str2.toCharArray();
		fw.write(ch);
		fw.flush();
		fw.close();

	}

}
