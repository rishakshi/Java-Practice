package dataStructures.hashing;

import java.util.Hashtable;

public class HashTableClasss {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, Integer> ht = new Hashtable<>();
		
		// NULL values will give exception
		ht.put(123, 432);
		ht.put(12, 2345);
		ht.put(15, 5643);
		ht.put(3, 321);
//		ht.put(2, null);
		
		ht.remove(12);
		
		System.out.println(ht);
		
	}

}
