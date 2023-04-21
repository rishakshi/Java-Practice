package wiley_core_java;

public class VarScope {
	
	int ins = 20;
	int val = 18;
	int val1 = 12;
	static String name = "Krishna";
	
	public void sum() {
		int val = 10;
		int val1 = 25;
		
		System.out.println("Sum : " + (val + val1));
		System.out.println("Sum of this : " + (this.val + this.val1));
	}
	
	public static void main(String[] args) {
		int val = 18;
		int loc = 10;
		
		VarScope vs = new VarScope();
		
		System.out.println("Local val : " + val);
		
//		System.out.println("Local val : " + this.val);
		
		System.out.println("Local variable loc : " + loc);
		
		System.out.println("Instance variable ins : " + vs.ins);
		
		System.out.println("Static variable name : " + name);
		
		vs.sum();
	}
	
}
