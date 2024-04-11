package stringmethods;

public class StrMethods1 {

	public static void main(String[] args) {
		String str1 = "ComputechInfoSolutions";//22 -> 0 to 21
		
		System.out.println("-----------startswith()----------");
		System.out.println(str1.startsWith("c"));//flase
		System.out.println(str1.startsWith("C"));//true
		System.out.println(str1.startsWith("Com"));//true
		System.out.println(str1.startsWith("Z"));//false
		System.out.println("-----------endswith()----------");
		System.out.println(str1.endsWith("S"));//false
		System.out.println(str1.endsWith("s"));//true
		System.out.println(str1.endsWith("ons"));//true
		System.out.println(str1.endsWith("Z"));//false
		
		
		
		
		
		
		
		
		
		
		
		
		String str2 = "Computech Info Solutions";
		System.out.println("-----------toUpperCase()----------");
		System.out.println(str2);
		System.out.println(str2.toUpperCase());
		System.out.println("-----------toLowerCase()----------");
		System.out.println(str1);
		System.out.println(str1.toLowerCase());
		System.out.println("-----------charAt()----------");
		System.out.println(str1.charAt(0));//C
		System.out.println(str1.charAt(9));//I
		System.out.println(str1.charAt(21));//s
		//System.out.println(str1.charAt(22));//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("-----------length()----------");
		//int a=10;
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		

	}

}
