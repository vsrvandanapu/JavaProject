package polymorphism.compilertime;

public class ClsUsageForMain {

	public static void main(String[] args) {
		
		DemoMainMethod.main("MathuSmitha");
		DemoMainMethod.main(60);
		DemoMainMethod.main(new String[] {"oranage", "banana","grapes"});
		int [] iarr = {10,20,30,40,50};
		DemoMainMethod.main(iarr);
	}

}
