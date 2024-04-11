package polymorphism.compilertime;

public class DemoMainMethod {

	public static void main(String[] args) {
		System.out.println("String array : ");
		System.out.println("~~~~~~~~~~");
		for (String val : args) {
			System.out.println(val);
		}
		System.out.println("~~~~~~~~~~");
	}

	public static void main(String val) {
		System.out.println("String parameter : ");
		System.out.println("~~~~~~~~~~");
		System.out.println(val);
		System.out.println("~~~~~~~~~~");
	}

	public static void main(int[] args) {
		System.out.println("int array : ");
		System.out.println("~~~~~~~~~~");
		for (int val : args) {
			System.out.println(val);
		}
		System.out.println("~~~~~~~~~~");
	}

	public static void main(int val) {
		System.out.println("int parameter : ");
		System.out.println("~~~~~~~~~~");

		System.out.println(val);
		System.out.println("~~~~~~~~~~");
	}

}
