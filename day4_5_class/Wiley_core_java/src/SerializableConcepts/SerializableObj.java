package SerializableConcepts;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableObj {
	
	public static void main(String[] args) {
		
//		Book b1 = new Book(108, "Java");
		Person p1 = new Person("Krishna", "Tiwari", 22);
		
		try {
			FileOutputStream fos = new FileOutputStream("books.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
//			oos.writeObject(b1);
			oos.writeObject(p1);
			
			oos.close();
			fos.close();
			
			System.out.println("Task Completed");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
