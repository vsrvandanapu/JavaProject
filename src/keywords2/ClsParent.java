package keywords2;

public class ClsParent {
	
	int a = 10;
	public ClsParent() {
		System.out.println("I am ClsParent Class default constructor");
	}
	public ClsParent(int i) {
		System.out.println("I am ClsParent Class one arg constructor");
		System.out.println("The int value is  : " + i);
	}
	public ClsParent(String aptName, int fNo) {
		System.out.println("I am ClsParent Class two arg constructor");
		System.out.println("The Apartment Name is  : " + aptName);
		System.out.println("The Flat No is  : " + fNo);
	}
	public void print() {
		System.out.println("I am a ClsParent class method");
	}

}
