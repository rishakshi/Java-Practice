package lambda;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BiFunctionClass {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> n = a -> a ^ 1;
		System.out.println(n.apply(1));
		
		BinaryOperator<Integer> m = (a, b) -> a&b;
		System.out.println(m.apply(18, 6));
		
	}

}
