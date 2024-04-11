package collections.mapinterface.hashmap;

import java.util.HashMap;

public class Test1 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Maths", 90);
		hm.put("Physics", 80);
		hm.put("Computers", 70);
		System.out.println("The Hashmap size is : " + hm.size());
		System.out.println("The Hashmap is : " + hm);
		System.out.println(hm.get("Maths"));
		System.out.println(hm.get("Physics"));
		System.out.println(hm.get("Computers"));

	}

}
