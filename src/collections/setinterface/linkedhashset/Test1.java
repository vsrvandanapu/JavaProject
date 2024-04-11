package collections.setinterface.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test1 {
	//linked hash set does not allow duplicates
	// linked hash set guarentees the order of insertion
	public static void main(String[] args) {

		LinkedHashSet<Integer> obj = new LinkedHashSet<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		System.out.println("The linked hash set size is : " + obj.size());
		Iterator<Integer> iter = obj.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

	}

}
