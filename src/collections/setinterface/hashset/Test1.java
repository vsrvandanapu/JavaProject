package collections.setinterface.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		System.out.println("The hash set size is: " + hs.size());
		System.out.println("~~~~~~~~~~iterator~~~~~~~~~~~~");
		Iterator<Integer> iter = hs.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		System.out.println("~~~~~~~~~~for each~~~~~~~~~~~~");
		for (Integer val : hs) {
			System.out.println(val);
		}
	}

}
