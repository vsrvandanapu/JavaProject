package stringmethods;

public class StrMethods4 {

	public static void main(String[] args) {
		System.out.println("-----------isEmpty()----------");
		String s ="";
		System.out.println(s.isEmpty());//true
		s = "Swati";
		System.out.println(s.isEmpty());//false
		System.out.println("-----------split()----------");
		String val = "This is a test";
		System.out.println(val);
		System.out.println(val.split(" "));
		System.out.println("-----------trim()----------");
		String a = "selenium";
		String b = " 1234 ";
		String c = "Automation";
		System.out.println(b);
		System.out.println(b.trim());
		System.out.println(a.concat(b).concat(c));
		System.out.println(a.concat(b.trim()).concat(c));
		System.out.println("-----------concat()----------");
		String s1="CIS";
		String s2="KPHB";
		String s3="Hyderabad";
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println("-----------'+' operator ----------");
		System.out.println(s1+s2+s3);
		System.out.println("-----------replace()----------");
		String str1 = "ComputechInfoSolutions";
		System.out.println(str1);
		System.out.println(str1.replace('t', '2'));
		System.out.println(str1);
		System.out.println(str1.replace("tech", "Tek"));

	}

}
