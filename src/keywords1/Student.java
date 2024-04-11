package keywords1;

public class Student {
	//instance variable or global variables
	int sNo;
	String sName;
	//this keyword is useful to distinguish between global and local variables
	public void display(int sNo, String sName) { // local variables
		this.sNo=sNo;
		this.sName=sName;
		System.out.println("-----------display()-----------");
		System.out.println("Student Number : " + sNo);
		System.out.println("Student Name : " + sName);
	}
	public void show() {
		System.out.println("-----------show()-----------");
		System.out.println("Student Number : " + sNo);
		System.out.println("Student Name : " + sName);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display(101, "Swati");
		s1.show();

	}

}
