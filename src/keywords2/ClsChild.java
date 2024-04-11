package keywords2;

public class ClsChild extends ClsParent {
	
	//super() can be used to invoke immediate parent class constructor.
	int a = 20;
	public ClsChild() {
		super("SiriPlaza", 401);
		System.out.println("I am ClsChild Class default constructor");
		
	}
	public void print() {
		System.out.println("I am a ClsChild class method");
	}
	//super can be used to refer immediate parent class instance variable.
	public void show() {
		System.out.println("---------instance variables---------");
//		System.out.println("ClsChild int var value is : " + a);
		System.out.println("ClsChild int var value is : " + this.a);
		System.out.println("ClsParent int var value is : " + super.a);
		System.out.println("---------instance methods---------");
//		print();
		this.print();
		//super can be used to invoke immediate parent class method.
		super.print();
	}

	public static void main(String[] args) {
		ClsChild cObj = new ClsChild();
		cObj.show();

	}

}
