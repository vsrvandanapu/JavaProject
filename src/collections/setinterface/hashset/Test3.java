package collections.setinterface.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Test3 {
// hash set does not guarentee the order of insertion
	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		System.out.println("The hash set size is: " + hs.size());
		System.out.println("~~~~~~~~~~iterator~~~~~~~~~~~~");
		Iterator<Integer> iter = hs.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}

}
