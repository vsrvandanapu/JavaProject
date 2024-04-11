package collections.listinterface.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Test10 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);

		System.out.println("The array list size is : " + al.size());
		
		Iterator<Integer> iter = al.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

}
