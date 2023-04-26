package StringClass;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer chartHistory = new StringBuffer();
		
		String sender = "Krishna";
		String message = "Hey Prachi!";
		
		chartHistory.append(sender);
		chartHistory.append(": ");
		chartHistory.append(message);
		chartHistory.append('\n');
		
		sender = "Prachi";
		message = "Hey Krishna";
		
		chartHistory.append(sender);
		chartHistory.append(": ");
		chartHistory.append(message);
		chartHistory.append('\n');
		
		System.out.println(chartHistory);
		
	}

}
