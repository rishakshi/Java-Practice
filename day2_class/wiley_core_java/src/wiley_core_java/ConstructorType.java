package wiley_core_java;

public class ConstructorType {
	
	public ConstructorType() {
		System.out.println("0 args constructor");
	}
	
	public ConstructorType(float a, int b) {
		this(2, 7);
		System.out.println("2 args with float count: " + a + " " + b);
	}
	
	public ConstructorType(int a, int b) {
		System.out.println("2 args count: " + a + " " + b);
	}
	
	public void add() {
		
	}
	
	public static void main(String[] args) {
		
		ConstructorType ct = new ConstructorType();
		
		ConstructorType ctadd = new ConstructorType(10, 20);
		
		ConstructorType ctfloat = new ConstructorType(10.12f, 20);
		
	}
}
