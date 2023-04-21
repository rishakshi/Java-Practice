package wiley_core_java;

class A1{
	public void Mul(int a, int b) {
		System.out.println("Multiply A : " + (a*b));
	}
}

class B1 extends A1{
	
	public void Mul(int a, int b) {
		System.out.println("Multiply B : " + (a*b));
	}
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		
		A1 b = new B1();
		b.Mul(1, 3);
		
	}
	
}
