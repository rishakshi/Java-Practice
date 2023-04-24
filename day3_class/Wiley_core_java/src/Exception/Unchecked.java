package Exception;

import java.util.ArrayList;

class StringNotFound extends RuntimeException{
	public StringNotFound(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return "Not found string";
	}
	
	@Override
	public String toString() {
		return "String not found";
	}
}

public class Unchecked {
	
	public static void main(String[] args) {
		
		ArrayList<String> students = new ArrayList<String>();
		students.add("Krishna");
		students.add("Anjali");
		students.add("Rishav");
		
		if (!students.contains("Krishna")) {
			try {
				throw new StringNotFound("This string not found");
			} catch (StringNotFound e) {
				// TODO: handle exception
				e.printStackTrace();
				
			}
		}
		System.out.println("Message 1");
		System.out.println("Message 2");
		
	}

}
