package methods.constructor;

public class Student {

	// one argument constructor
	public Student(int sNo) {
		System.out.println("-------one argument constructor--------");
		System.out.println("Student Number : " + sNo);
	}

	public static void main(String[] args) {
		Student s1 = new Student(10);
		Student s2 = new Student(15);

	}

}
