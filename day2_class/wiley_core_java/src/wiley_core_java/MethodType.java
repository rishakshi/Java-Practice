package wiley_core_java;

class Test{
	public static int add(int v1, int v2) {
		int val = v1 + v2;
//		System.out.println("Addition in instance method : " + val);
		return val;
	}
}

public class MethodType {
	
	public void sub(int v1, int v2) {
		int val = v1- v2;
		System.out.println("Substraction instance methods : " + val);
	}
	
	public void add(int v1, int v2) {
		int val = v1 + v2;
		System.out.println("Addition in instance method : " + val);
		this.sub(6, 2);
	}
	
//	public static void mul(int v1, int v2) {
//		int val = v1 * v2;
//		System.out.println("Multiplication of static method : " + val);
//	}
	
	public static int mul(int v1, int v2) {
		int val = v1 * v2;
		return val;
	}
	
	public static void main(String[] args) {
		
		int m = mul(26, 36);
		 
		System.out.println(m);
		
		MethodType mt = new MethodType();
		
		mt.add(25, 27);
		
		mt.sub(5, 2);
		
		System.out.println("Test add method : " + Test.add(15, 65));
	}
}
