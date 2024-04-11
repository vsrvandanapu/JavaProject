package classandobject1;

public class Studnet {
	
	// variables or instance variable
	int sNo;
	String sName;
	double sMarks;
	
	// Methods
	
	public void display()
	{
		System.out.println(" Displaying the student details : ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	public static void main(String[] args) {
		/*
		 Object creation : 
		 ClassName referenceVariable = new ClassName();
		 */
		Studnet s1 = new Studnet();
		/* 
		 To access the variable and assign the values
		 referenceVariable.variableName= value;
		 */
		s1.sNo = 101;
		s1.sName = "Swathi";
		s1.sMarks = 550;
		/* 
		 To access the methods
		 referenceVariable.methodName();
		 */
		s1.display();
		System.out.println("Student No : " + s1.sNo);
		System.out.println("Student Name : " + s1.sName);
		System.out.println("Student Total marks : " + s1.sMarks);
		System.out.println("############################");
		Studnet s2 = new Studnet();
		s2.sNo=102;
		s2.sName="MadhuSmitha";
		s2.sMarks=500;
		//To invoke the method 
		s2.display();
		System.out.println("Student No : " + s2.sNo);
		System.out.println("Student Name : " + s2.sName);
		System.out.println("Student Total marks : " + s2.sMarks);
	}

}
