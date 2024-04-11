package collections.listinterface.linkedlist;

import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);

		System.out.println("The linked list size is : " + ll.size());
		for(int i = 0; i < ll.size(); i++)
		{
			System.out.println(ll.get(i));
		}

	}

}
