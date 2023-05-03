package collections;

import java.util.TreeSet;

public class SetClasses {
	
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("h");
		ts.add("b");
		ts.add("w");
		ts.add("a");
		
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet("b"));
		System.out.println(ts.tailSet("h"));
		System.out.println(ts.subSet("b", "w"));
		
		System.out.println(ts);
		
		System.out.println(ts.descendingSet());
		
		
		TreeSet<Integer> ts1 = new TreeSet<>();
		
		ts1.add(1);
		ts1.add(12);
		ts1.add(13);
		ts1.add(14);
		ts1.add(15);
		
		System.out.println(ts1.first().compareTo(ts1.last()));
		
	}

}
