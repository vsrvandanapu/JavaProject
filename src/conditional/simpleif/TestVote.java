package conditional.simpleif;

public class TestVote {

	public static void main(String[] args) {
		// To verify the person is elegible for vote or not?
		System.out.println("---------Begining---------");
		int age;
		age = 20;
		if(age >= 18) 
		{
			System.out.println("The person is eligible to vote..");
			System.out.println("The person age is : " + age + " Years");
		}
		System.out.println("---------Ending---------");
	}

}
