package collections.setinterface.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
		// Treeset sorts the elements in natural order(ascending order)
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(30);
		ts.add(20);
		ts.add(10);
		System.out.println("The tree set size is : " + ts.size());
		Iterator<Integer> iter = ts.iterator();
		System.out.println("~~~~~~~iterator with while loop~~~~~~~~~");
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

}
