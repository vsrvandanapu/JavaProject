package staticandnonstatic;

public class Department {
	
	// non static variables
	int dNo;
	public String dName;
	int noOfEmps;
	// static variables
	public static String cName;
	// non static methods
	void addDept() {
		System.out.println("Department added..");
	}
	public void deptDetails() {
		System.out.println("Department No : " + dNo);
		System.out.println("Department Name : " + dName);
		System.out.println("No of Emps in a Department : " + noOfEmps);
	}
	//  static methods
	public static void salary() {
		System.out.println("Salary credited to accounts..");
	}
	 static void holiday() {
		System.out.println("National holiday granted..");
	}
}
