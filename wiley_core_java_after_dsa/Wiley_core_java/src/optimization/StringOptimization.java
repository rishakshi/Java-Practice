package optimization;

public class StringOptimization {
	
	public static void main(String[] args) {
	
		// INEFFICIANT
		long start = System.currentTimeMillis();
		String result = "";
		for(int i=0; i<100000; i++) {
			result += i;
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end-start));
		
		// EFFICIANT
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<100000; i++) {
			sb.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end-start));
		
		
	}

}
