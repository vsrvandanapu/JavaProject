package classandobject2;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.eNo=55;
		e1.eName="MadhuSmita";
		e1.eGrade='A';
		e1.eDes="Test Engineer";
		e1.eSalary=30000;
		e1.print();
		e1.holiday();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@");
		Employee e2 = new Employee();
		e2.eNo=66;
		e2.eName="Swathi";
		e2.eGrade='A';
		e2.eDes="Sr TE";
		e2.eSalary=750000;
		e2.print();
		e2.holiday();
	

	}

}
