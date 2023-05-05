package collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SetClasses {
	
	public static void main(String[] args) {
		
		NavigableSet<String> ts = new TreeSet<String>();
		
		ts.add("h");
		ts.add("b");
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
		
	}

}
