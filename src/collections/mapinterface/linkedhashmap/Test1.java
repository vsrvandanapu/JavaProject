package collections.mapinterface.linkedhashmap;

import java.util.LinkedHashMap;

public class Test1 {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		hm.put("Maths", 90);
		hm.put("Physics", 80);
		hm.put("Computers", 70);
		System.out.println("The LinkedHashMap size is : " + hm.size());
		System.out.println("The LinkedHashMap is : " + hm);
		System.out.println(hm.get("Maths"));
		System.out.println(hm.get("Physics"));
		System.out.println(hm.get("Computers"));

	}

}
