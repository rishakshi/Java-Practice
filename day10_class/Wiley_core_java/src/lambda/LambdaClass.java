package lambda;

public class LambdaClass {
	
	static String printThing(Printable thing) {
		return thing.print(" Edge");
	}
	
	public static void main(String[] args) {
//		Product myProd = new Product();
//		myProd.print();
//		printThing(myProd);
		
//		printThing(() -> System.out.println("Lambda"));
		
//		Printable lambdaPriciple = () -> System.out.println("Lambda");
//		Printable lambdaPriciple = s -> System.out.println("Lambda " + s);
//		Printable lambdaPriciple = (p, s) -> System.out.println(p + " Lambda " + s);
		
//		Printable lambdaPriciple = (p,s) -> {
//			System.out.println(p + " Lambda " + s);
//			return "Wiley";
//		};
		
		Printable lambdaPriciple = s -> {
			return "Wiley" + s;
		};
		
//		lambdaPriciple.print("a", "b");
		System.out.println(printThing(lambdaPriciple));
//		System.out.println(lambdaPriciple);
		
	}

}
