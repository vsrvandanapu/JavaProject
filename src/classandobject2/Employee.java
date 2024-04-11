package classandobject2;

public class Employee {
	
	// variables
	int eNo;
	String eName;
	char eGrade;
	String eDes;
	double eSalary;
	
	// methods
	public void print() {
		System.out.println("-------------print()-------------");
		System.out.println("Printing the Employee details..");
		System.out.println("________________________________");
		System.out.println("Employee Number : " + eNo);
		System.out.println("Employee Name : " + eName);
		System.out.println("Employee Grade : " + eGrade);
		System.out.println("Employee Designation : " + eDes);
		System.out.println("Employee Salary : " + eSalary);
		System.out.println("________________________________");
	}

	public void holiday() {
		System.out.println("-------------holiday()-------------");
		System.out.println("Employee have national holiday..");
	}
	
}
