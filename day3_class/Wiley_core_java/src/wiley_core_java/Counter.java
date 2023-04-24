package wiley_core_java;

public class Counter {

	private static int count = 0;
	private final String name = "Krishna";
	
	
	public synchronized void increment() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		
	}
	
}
