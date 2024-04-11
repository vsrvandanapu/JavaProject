package collections.listinterface.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
//		List l = new List();
		// Collections are desinged to store only objects
		// collections can not store primitive type values
//		ArrayList<int> al = new ArrayList<int>();
//		ArrayList<Integer> al = new ArrayList<Integer>();
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);

		System.out.println("The array list size is : " + al.size());
//		System.out.println(al.get(0));
//		System.out.println(al.get(1));
//		System.out.println(al.get(2));
		for(int i = 0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}

	}

}
