package StringClass;

import java.util.Arrays;
import java.util.List;

public class StringFormat {
	
	public static void main(String[] args) {
		
		String title = "Java Developer";
		float salary = 2000.2900012f;
		
		System.out.format("%s has %.3f USD salary", title, salary);
		System.out.println();
		
		List<String> techStack = Arrays.asList(
				"Essenetial Java",
				"Head First Java",
				"Java Design Patterns"
				);
		
		for(String book: techStack) {
			System.out.format("%-40s - In stock%n", book);
		}
		System.out.println();
		
	}

}
