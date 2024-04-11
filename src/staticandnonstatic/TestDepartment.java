package staticandnonstatic;

public class TestDepartment {

	public static void main(String[] args) {
		
		System.out.println("~~~~~~Static~~~~~~~");
		Department.cName="Capgemini";
		System.out.println("Company Name : " + Department.cName);
		Department.salary();
		Department.holiday();
		
		System.out.println("~~~~~~Non Static~~~~~~~");
		Department d1 = new Department();
		d1.dNo=101;
//		d1.cName
		d1.dName="Sales";
		d1.noOfEmps=200;
		d1.addDept();
		d1.deptDetails();
		Department d2 = new Department();
		d2.dNo=102;
		d2.dName="IT";
		d2.noOfEmps=5000;
		d2.addDept();
		d2.deptDetails();

	}

}
