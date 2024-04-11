package conditional.switchcase;

import java.util.Scanner;

public class TrafficSignals {

	public static void main(String[] args) {
		
		//char color = 'r','e';
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the traffic signal color : ");
		String color = sc.next();
		color=color.toLowerCase();
		switch (color) {
		case "red":
				System.out.println("Stop..");
				System.out.println("Traffic signal color is : " + color);
			break;
		case "green":
			System.out.println("Go..");
			System.out.println("Traffic signal color is : " + color);
			break;
		case "yellow":
			System.out.println("Ready to Go/ Ready to Stop..");
			System.out.println("Traffic signal color is : " + color);
			break;
		default:
			System.out.println("User enterred the wrong color : " + color);
			break;
		}
		//String color = sc.nextLine();
		//System.out.println("Entered traffic signal color is : " + color);
		sc.close();
		

	}

}
