package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapClasses {
	
	public static void main(String[] args) {
		
		Map<String, String> ss = new HashMap<String,String>();
		
		ss.put("a", "A");
		ss.put("b", "B");
		ss.put("c", "C");
		ss.put("d", null);
		ss.put(null, "nullVal");
		ss.put(null, null);
		ss.put("e", null);
		
		System.out.println(ss);
		
		HashMap<String, Integer> empId = new HashMap<String, Integer>();
		
		empId.put("Venkat", 1234);
		empId.put("Rishav", 2345);
		empId.put("Shivam", 3456);
		empId.put("Sachin", 4567);
		empId.put("Kritika", 5678);
		empId.put("Kritika", 6789);
		
		System.out.println(empId);
		System.out.println(empId.get("Rishav"));
		empId.putIfAbsent("Venkat", 207);
		empId.remove("Sachin");
		
		System.out.println(empId);
		
		// LinkedHashMap
		
		LinkedHashMap mymap = new LinkedHashMap();
		
		mymap.put(1, 1);
		mymap.put("a", "A");
		
		System.out.println(mymap);
		
	}

}
