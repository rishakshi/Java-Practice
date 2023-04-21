package wiley_core_java;

public class CompileTimePolymorphism {
	
	public static void add(int a, int b) {
		System.out.println("Add of 2 nums : " + (a+b));
	}
	
	public static void add(int a, int b, int c) {
		System.out.println("Add of 2 nums : " + (a+b+c));
	}

	public static void main(String[] args) {
		
		add(2, 3);
		add(2, 3, 4);
		
	}
	
}
