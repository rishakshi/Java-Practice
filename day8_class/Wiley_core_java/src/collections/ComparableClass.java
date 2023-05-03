package collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyClass implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1 < o2) {
			return -1;
		}
		else if (o1 > o2) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}

public class ComparableClass {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ss = new TreeSet<>(new MyClass());
		
		ss.add(1);
		ss.add(4);
		ss.add(2);
		
		System.out.println(ss);
		
	}

}
