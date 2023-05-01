package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<T> {
	
	public static <T, V> T shout(T shoutOut, V valueToBring) {
		System.out.println(shoutOut + "!!!");
		System.out.println(valueToBring + "!!!");
		return shoutOut;
	}
	
	public static void main(String[] args) {
//		Printer<Cat> printer = new Printer<>(new Cat());
//		printer.print();
//		
//		Printer<Dog> printer1 = new Printer<>(new Dog());
//		printer1.print();
//		
//		ArrayList<Object> cats = new ArrayList<>();
//		cats.add(new Cat());
//		cats.add(new Cat());
//		cats.add(new Dog());
		
//		shout("Bring food", 5);
//		shout(20000);
//		shout(new Dog());
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(3);
		intList.add(7);
		printList(intList);
		
		List<Cat> catList = new ArrayList<Cat>();
		printList(catList);
		
	}
	
	private static void printList(List<?> myList) {
		System.out.println(myList.toString());
	}
	
}
