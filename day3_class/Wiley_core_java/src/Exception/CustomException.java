package Exception;

class AgeNotValid extends Exception {
	public AgeNotValid (String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return "Not valid age";
	}
	
	@Override
	public String toString() {
		return "age not applicable";
	}
	
}

public class CustomException{
	
	public static void getAge(int age) throws AgeNotValid{
		if(age > 18) {
			try {
//				throw new Exception("age not valid");
				throw new AgeNotValid("age Not Valid");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
//				e.printStackTrace();
				System.out.println(e.toString());
			}
		}
		else {
			System.out.println("Age valid");
		}
	}
	
	public static void main(String[] args) throws AgeNotValid {
		getAge(21);
	}
}
