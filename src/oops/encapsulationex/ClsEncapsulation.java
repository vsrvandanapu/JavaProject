package oops.encapsulationex;

public class ClsEncapsulation {

	public static void main(String[] args) {
		ClsSalary obj = new ClsSalary();
		//System.out.println("Salary is : " + obj.salary);
		System.out.println("Name is : " + obj.name);
		System.out.println("Employee salary is : " + obj.getSalary("Manager"));
		System.out.println("------Hike--------");
		obj.setSalary("15000", "Admin");
		System.out.println("Employee salary is : " + obj.getSalary("Manager"));

	}

}
