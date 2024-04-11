package collections.mapinterface.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		hm.put("Maths", 90);
		hm.put("Physics", 80);
		hm.put("Computers", 70);
		System.out.println("The LinkedHashMap size is : " + hm.size());
		System.out.println("~~~~~~~~~~keySet()~~~~~~~~~~");
		Set<Entry<String, Integer>>  entries = hm.entrySet();
		for (Entry<String, Integer> entry : entries) 
		{
			String key = entry.getKey();
//			System.out.println(key);
			Integer val = entry.getValue();
			System.out.println(key +  " -> " +val);
		}
	}

}
