package polymorphism.compilertime;

public class Test extends Demo {
	void show(char x){
		System.out.println("char value : " + x);
	}
	
	public static void main(String[] args) {
		Test t = new Test();

		t.show(66);
		t.show('P');
	}
}
