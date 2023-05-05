package lambda;

public class Product implements Printable {
	
	public String name;
	public int pId;
	
	public Product() {}

	public String print(String p) {
		// TODO Auto-generated method stub
		System.out.println("This is a Product class which implements printable interface");
		return "w";
	}

}
