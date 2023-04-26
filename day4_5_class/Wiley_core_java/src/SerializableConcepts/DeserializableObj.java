package SerializableConcepts;

import java.io.*;

public class DeserializableObj {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("books.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
//			Book b = (Book) ois.readObject();
//			System.out.println("Book code : " + b.bookCode);
//			System.out.println("Book name : " + b.bookName);
			
			Person p = (Person) ois.readObject();
			System.out.println("First Name : " + p.firstName);
			System.out.println("Last Name : " + p.lastName);
			System.out.println("Age : " + p.age);
			
			ois.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
