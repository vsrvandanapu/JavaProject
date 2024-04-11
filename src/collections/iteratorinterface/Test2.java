package collections.iteratorinterface;

import java.util.HashSet;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		System.out.println("The hash set size is: " + hs.size());
		Iterator<Integer> iter = hs.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}

}
