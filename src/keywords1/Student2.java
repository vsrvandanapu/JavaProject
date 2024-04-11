package keywords1;

public class Student2 {
	//instance variable
	int stNo;
	String stName;
	
	public void display(int sNo, String sName) { // local variables
		stNo=sNo;
		stName=sName;
		System.out.println("-----------display()-----------");
		System.out.println("Student Number : " + sNo);
		System.out.println("Student Name : " + sName);
	}
	public void show() {
		System.out.println("-----------show()-----------");
		System.out.println("Student Number : " + stNo);
		System.out.println("Student Name : " + stName);
	}
	
	public static void main(String[] args) {
		Student2 s1 = new Student2();
		s1.display(101, "Swati");
		s1.show();

	}

}
