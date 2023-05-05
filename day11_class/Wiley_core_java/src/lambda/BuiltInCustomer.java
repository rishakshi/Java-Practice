package lambda;

import java.util.function.BiConsumer;

public class BuiltInCustomer {
	
	public static void main(String[] args) {
	
		BiConsumer<Integer, Integer> el = (Integer age, Integer percent) -> {
			if(age > 18 && percent > 75) {
				System.out.println("You are eligible for the Job");
			}
			else {
				System.out.println("You are not eligible for the Job");
			}
		};
		
		System.out.println(el);
		el.accept(21, 81);
		
	}

}
