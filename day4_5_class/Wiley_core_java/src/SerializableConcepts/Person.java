package SerializableConcepts;

import java.io.Serializable;

public class Person implements Serializable{

private static final long serialVersionUID = 1L;
	
	String firstName;
	String lastName;
	int age;
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
}
