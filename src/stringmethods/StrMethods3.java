package stringmethods;

public class StrMethods3 {

	public static void main(String[] args) {
		String str1="SELENIUM";
		String str2="selenium";
		String str3="SELENIUM";
		
		System.out.println("-----------compareTo()----------");
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str2.compareTo(str1));
		System.out.println("-----------equals()----------");
		System.out.println(str1.equals(str2));//false
		System.out.println(str1.equals(str3));//true
		System.out.println("-----------equalsIgnoreCase()----------");
		System.out.println(str1.equalsIgnoreCase(str2));//true
		System.out.println(str1.equalsIgnoreCase(str3));//true
		System.out.println("-----------relationalOperator----------");
		System.out.println(str1 == str2);//False
		System.out.println(str1 == str3);//True


	}

}
