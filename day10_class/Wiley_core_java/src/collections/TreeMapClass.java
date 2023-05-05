package collections;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(1000, "Venkat");
		tm.put(2000, "Rishav");
		tm.put(3000, "Sachin");
		tm.put(4000, "Janavi");
		tm.put(5000, "Shivam");

		System.out.println(tm);

		tm.forEach((k, v) -> System.out.println("Key : " + k + " - val : " + v));
		System.out.println("Last Key : " + tm.lastKey());
		System.out.println("First Key : " + tm.firstKey());

		Set<Integer> keyLessThan3k = tm.headMap(3000).keySet();

		System.out.println(keyLessThan3k);

		Set<Integer> keyMoreThan3k = tm.tailMap(3000).keySet();

		System.out.println(keyMoreThan3k);

		TreeMap<String, Integer> userMap = new TreeMap<String, Integer>();

		userMap.put("venkat", 108);
		userMap.put("rishav", 109);
		userMap.put("sachin", 81);
		userMap.put("rohit", 91);
		userMap.put("praveen", 18);
		userMap.put("muskan", 28);

		userMap.forEach((k, v) -> System.out.println("key: " + k + " - val: " + v));

	}

}
