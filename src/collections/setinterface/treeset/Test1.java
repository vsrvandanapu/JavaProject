package collections.setinterface.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		System.out.println("The tree set size is : " + ts.size());
		System.out.println("~~~~~~~for each loop~~~~~~~~~");
		for(Integer val : ts)
		{
			System.out.println(val);
		}
		Iterator<Integer> iter = ts.iterator();
		System.out.println("~~~~~~~iterator with while loop~~~~~~~~~");
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		/*
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.next());*/
	}

}
