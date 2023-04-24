package demo_protected;

import wiley_core_java.AccessModifier;

public class Demo1 extends AccessModifier {
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier(); // can only access a
		
		Demo1 d = new Demo1(); // can access a and c
	}
}
