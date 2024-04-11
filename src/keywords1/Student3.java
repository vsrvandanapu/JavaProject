package keywords1;

public class Student3 {
	//instance variable
	int sNo;
	String sName;
	
	public void display(int sNo, String sName) { // local variables
		sNo=sNo;
		sName=sName;
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
		Student3 s1 = new Student3();
		s1.display(101, "Swati");
		s1.show();

	}

}
