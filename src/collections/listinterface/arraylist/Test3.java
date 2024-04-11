package collections.listinterface.arraylist;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		System.out.println("The array list size is : " + al.size());
		for(Integer val : al)
		{
			System.out.println(val);
		}

	}

}
