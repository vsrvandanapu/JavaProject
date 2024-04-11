package collections.mapinterface.treemap;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Test1 {

	public static void main(String[] args) {
		TreeMap<String, Integer> hm = new TreeMap<String, Integer>();
		hm.put("Maths", 90);
		hm.put("Physics", 80);
		hm.put("Computers", 70);
		System.out.println("The TreeMap size is : " + hm.size());
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
