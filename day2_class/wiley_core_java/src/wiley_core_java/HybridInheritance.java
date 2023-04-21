package wiley_core_java;

class A{
	
	public void fun1() {
		System.out.println("A");
	}
	
}

class B extends A {

	public void fun2() {
		System.out.println("B");
	}
	
}

class C extends A {

	public void fun3() {
		System.out.println("C");
	}
	
}

class D extends B {

	public void fun4() {
		System.out.println("D");
	}
	
}

class E extends D {

	public void fun5() {
		System.out.println("E");
	}
	
}

public class HybridInheritance {
	public static void main(String[] args) {
		
		C c = new C();
		c.fun1();
		c.fun3();
		
		E e = new E();
		e.fun1();
		e.fun2();
		e.fun4();
		e.fun5();
		
	}
}
