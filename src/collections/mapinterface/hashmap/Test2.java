package collections.mapinterface.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Maths", 90);
		hm.put("Physics", 80);
		hm.put("Computers", 70);
		System.out.println("The Hashmap size is : " + hm.size());
		System.out.println("~~~~~~~~~~keySet()~~~~~~~~~~");
		Set<String> keys = hm.keySet();
		for(String keyName : keys)
		{
			System.out.println(keyName);
		}
		System.out.println("~~~~~~~~~~values()~~~~~~~~~~");
		Collection<Integer> values = hm.values();
		for(Integer val : values)
		{
			System.out.println(val);
		}
	}

}
