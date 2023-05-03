package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		Set<String> ts = new TreeSet<String>();
		
		hs.add("Java");
		hs.add("Java");
		hs.add("Java");
		hs.add("Python");
		hs.add("JavaScript");
		hs.add("mysql");
		
		System.out.println(hs);
		
		ArrayList<String> al = new ArrayList<>();
		al.add("ab");
		al.add("ab");
		al.add("ab");
		al.add("ab");
		
		hs.addAll(al);
		System.out.println(hs);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(1);
		lhs.add(0);
		lhs.add(3);
		lhs.add(2);
		
		System.out.println(lhs);
		
	}

}
