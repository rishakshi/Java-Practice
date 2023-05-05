package lambda;

@FunctionalInterface
interface Calc {
	// Abstract Method
	int calculate(int val);
	
//	default int add(int a, int b) {
//		return a + b;
//	}
}

public class FuctionalInterfaceClass {
	public static void main(String[] args) {

		Calc c1 = (int val) -> val + 54;

		System.out.println("Result : " + c1.calculate(54));

	}
}
