package collections;

import java.util.ArrayList;

public class FinalArrayList {
	
	public static void main(String[] args) {
		
		final ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		
		al.set(0, 7);
		
		System.out.println(al);
		
	}

}
