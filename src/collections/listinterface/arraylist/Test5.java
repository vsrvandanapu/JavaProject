package collections.listinterface.arraylist;

import java.util.ArrayList;

public class Test5 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Red");
		al1.add("Green");
		al1.add("Blue");
		System.out.println("The first array list size is : " + al1.size());
		for(String fColor : al1)
		{
			System.out.println(fColor);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Pink");
		al2.add("Yellow");
		al2.add("Black");
		System.out.println("The second array list size is : " + al2.size());
		for(String sColor : al2)
		{
			System.out.println(sColor);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		al1.addAll(al2);
		System.out.println("Now the first array list size is : " + al1.size());
		for(String fColor : al1)
		{
			System.out.println(fColor);
		}
	}

}
