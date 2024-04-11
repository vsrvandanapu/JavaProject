package collections.listinterface.arraylist;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println("The array list size is : " + al.size());
		for(Integer val : al)
		{
			System.out.println(val);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		al.add(40);
		System.out.println("The array list size is : " + al.size());
		for(Integer val : al)
		{
			System.out.println(val);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		al.add(0, 5);
		al.add(2, 50);
		System.out.println("The array list size is : " + al.size());
		for(Integer val : al)
		{
			System.out.println(val);
		}

	}

}
