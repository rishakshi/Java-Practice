package lambda;

import java.util.HashMap;
import java.util.function.Function;

public class BuiltInFunction {
	
	private static HashMap<Integer, String> Employee = new HashMap<>();
	
	public static void add(String name, int ID) {
		if(!Employee.containsKey(ID)) {
			Employee.put(ID, name);
		} else {
			System.out.println("Employee already exist...!");
		}
	}
	
	public static void main(String[] args) {
	
		Function<Integer, String> get = (Integer ID) -> {
			if(Employee.containsKey(ID)) return Employee.get(ID);
			else return "Invalid ID";
		};
		
		// Add employees to hashmap
		add("Rishav", 1091);
		add("Anjali", 1092);
		add("Janavi", 1093);
		add("Sachin", 1094);
		add("Anil", 1095);
		
		System.out.println("Id = 1093, Name = " + get.apply(1093));
		
	}

}
