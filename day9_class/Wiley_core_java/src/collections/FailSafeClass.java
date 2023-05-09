package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeClass {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m = new ConcurrentHashMap<>();
		
		m.put(1, "Java");
		m.put(2, "Python");
		
		Iterator it = m.keySet().iterator();
		
		while(it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println(key + " : " + m.get(key));
			m.put(3, "React");
		} 
		
	}

}
