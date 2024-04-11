package collections.listinterface.arraylist;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);

		System.out.println("The array list size is : " + al.size());
		for(int i = 0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		//System.out.println(al.get(3));

	}

}
