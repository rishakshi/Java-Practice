package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastClass {
	
	public static void main(String[] args) {
		
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("a");
		list.add("b");
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			String el = iter.next();
			System.out.println(el);
			list.add("c");
		}
		
		System.out.println(list);
		
	}

}
