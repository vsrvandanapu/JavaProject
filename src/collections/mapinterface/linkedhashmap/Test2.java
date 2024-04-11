package collections.mapinterface.linkedhashmap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		hm.put("Maths", 90);
		hm.put("Physics", 80);
		hm.put("Computers", 70);
		System.out.println("The LinkedHashMap size is : " + hm.size());
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
