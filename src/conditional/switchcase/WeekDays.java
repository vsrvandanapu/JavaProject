package conditional.switchcase;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter week day number ");
		int weekDayNo = sc.nextInt();
		switch(weekDayNo)
		{
		case 1:
			System.out.println("Mon day..");
			break;
		case 2:
			System.out.println("Tue day..");
			break;
		case 3:
			System.out.println("Wed day..");
			break;
		case 4:
			System.out.println("Thu day..");
			break;
		case 5:
			System.out.println("Fri day..");
			break;
		case 6:
			System.out.println("Sat day..");
			break;
		case 7:
			System.out.println("Sun day..");
			break;
		default:
			System.out.println("You entered the wrong week day number : "+ weekDayNo);
		}

	}

}
