package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomArrayList extends ArrayList {
	
	public boolean add(Object o) {
		if(this.contains(o)) {
			return true;
		}
		else {
			return super.add(o);
		}
	}
	
	public static void main(String[] args) {
		CustomArrayList list = new CustomArrayList();
		
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(6);
		list.add(6);
		
		System.out.println(list);
		
		
		
//		Set<GeniusStudent> setStudent = new HashSet<>();
		List<GeniusStudent> setStudent = new ArrayList<GeniusStudent>();
		
		GeniusStudent gst1 = new GeniusStudent(101, "Rishav", 56.76);
		GeniusStudent gst2 = new GeniusStudent(109, "Sachin", 67.54);
		GeniusStudent gst3 = new GeniusStudent(103, "Steve", 44.67);
		GeniusStudent gst4 = new GeniusStudent(100, "Anjali", 65.44);
		
		setStudent.add(gst1);
		setStudent.add(gst2);
		setStudent.add(gst3);
		setStudent.add(gst4);
		
		Collections.sort(setStudent);
		
		System.out.println(setStudent);
	}

}
