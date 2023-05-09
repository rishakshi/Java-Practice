package lambda;

@FunctionalInterface
public interface Printable {
	public String print(String p); // abstract

	default void sayHi() {

	}

	public static void sayOk() {

	}
}
