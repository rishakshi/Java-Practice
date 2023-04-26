package StringClass;

public class StringBuilderClass {

	public static void main(String[] args) {

//		StringBuilder sb = new StringBuilder("Wiley");
//		sb.append(" Edge");

		// "[timestamp] user userId : logged in successfully]"

		StringBuilder logMessage = new StringBuilder();

		long timeStamp = System.currentTimeMillis();

		logMessage.append("[").append(timeStamp).append("] ");

		int userId = 123456;

		logMessage.append("User ").append(userId).append(": ");
		
		String message = "Login Sccessfully";
		logMessage.append(message);
		
		System.out.println(logMessage.toString());

	}

}
