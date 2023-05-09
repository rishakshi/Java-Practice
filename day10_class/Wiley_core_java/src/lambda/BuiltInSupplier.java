package lambda;

import java.util.function.Supplier;

public class BuiltInSupplier {

	public static void main(String[] args) {

		Supplier<String> msg = () -> "Wish you a happy married life Mr. Rishav Raj...!! Invite us...!!";
		System.out.println(msg.get());

	}

}
