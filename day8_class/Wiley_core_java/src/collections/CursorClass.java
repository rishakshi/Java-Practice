package collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class CursorClass {
	
	public static void main(String[] args) {
		
		Vector<String> vc = new Vector<String>();
		
//		vc.addElement("a");
//		vc.addElement("a");
//		vc.addElement("a");
//		vc.addElement("a");
//		vc.addElement("a");
//		vc.addElement("a");
		
		Enumeration<String> ev = vc.elements();
		
		while(ev.hasMoreElements()) {
			System.out.println(ev.nextElement());
		}
		
		Iterator<String> it = vc.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
		 LinkedList<String> li = new LinkedList<String>();
//		 List<String> li = new ArrayList<String>();
		 
		 li.add("a");
		 li.add("a");
		 li.add("a");
		 li.add("a");
		 li.add("a");
		 
		 ListIterator<String> listr = li.listIterator();
		 System.out.println(listr.hasPrevious());
		
	}

}
