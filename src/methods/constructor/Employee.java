package methods.constructor;

public class Employee {
	
	public Employee() {
		System.out.println("---------default constructor---------");
		System.out.println("Employee Object is created");
	}

	public Employee(int eNo) {
		System.out.println("---------one arg constructor---------");
		System.out.println("Employee No : " + eNo);
	}
	public Employee(String eName, String officeLocation) {
		System.out.println("---------Two arg constructor---------");
		System.out.println("Employee Name : " + eName);
		System.out.println("Employee Office Locattion : " + officeLocation);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(44);
		Employee e3 = new Employee("Swathi", "Pune");
	}

}
