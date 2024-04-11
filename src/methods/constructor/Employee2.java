package methods.constructor;

public class Employee2 {
	
	// Two argument constructor
    public Employee2(int eNo, String eName) {
		System.out.println("---------Two argument constructor---------");
		System.out.println("Employee Number : " + eNo);
		System.out.println("Employee Name : " + eName);
	}
	public static void main(String[] args) {
		Employee2 e1 = new Employee2(101,"Swati");
		Employee2 e2 = new Employee2(102,"Madhu");

	}

}
