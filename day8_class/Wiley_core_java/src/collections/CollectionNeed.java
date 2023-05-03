package collections;

class Student{}

class Book{}

public class CollectionNeed {
	
	public static void main(String[] args) {
		
		// Limitation of array
		// 1. FIxed in size
		// 2. Arrays can hold only homogeneous data elements
		// 3. ready made API's support is not available in array
		
		Student[] s = new Student[10];
		s[0] = new Student();		
		s[1] = new Student();		
//		s[2] = new Book();	
		
		Object[] o = new Object[10];
		o[0] = new Student();
		o[1] = new Book();
	}

}
