package conditional.simpleif;

import java.util.Scanner;

public class TestVote2 {

	public static void main(String[] args) {
		// To verify the person is elegible for vote or not?
		System.out.println("---------Begining---------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person age : ");
		int age =sc.nextInt();
		if(age >= 18) 
		{
			System.out.println("The person is eligible to vote..");
			System.out.println("The person age is : " + age + " Years");
		}
		System.out.println("---------Ending---------");
	}

}
