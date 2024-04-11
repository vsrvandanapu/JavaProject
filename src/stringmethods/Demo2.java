package stringmethods;

public class Demo2 {

	public static void main(String[] args) {
		String str = "Computech";
		int a = 12;
		int b = 34;
		System.out.println(str+a+b);//Computech1234
		System.out.println(a+b+str);//46Computech
		System.out.println(str+(a+b));//Computech46

	}

}
