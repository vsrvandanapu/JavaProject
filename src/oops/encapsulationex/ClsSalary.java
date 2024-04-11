package oops.encapsulationex;

public class ClsSalary {
	private String salary = "12000";
	String name = "Vasu";

	public String getSalary(String role) {
		if (role == "Manager") {
			return salary;
		} else {
			return "Access is denied :, You are a  " + role;
		}
	}

	public void setSalary(String salary, String role) {
		if(role == "Admin")
		{
			this.salary = salary;
		}
		else
		{
			System.out.println("Unauhtorized access, you are a " + role);
		}
	}

	public static void main(String[] args) {
		ClsSalary obj = new ClsSalary();
		System.out.println("Salary is : " + obj.salary);
		System.out.println("Name is : " + obj.name);
	}

}
