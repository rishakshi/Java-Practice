package wiley_core_java;

public class InstanceOrder {
	
	String name;
	int age;
	
	
	// first instance block will run the constructor block
	
	{
		name = "Krishna";
		age = 21;
		System.out.println("Instance Block");
	}
	
	public InstanceOrder() {
		System.out.println("Name : " + name + ", Age : " + age);
		System.out.println("Constructor block");
	}
	
	public InstanceOrder(int a, int b) {
		System.out.println("Constructor Parameterized : " + (a+b));
	}
	
	public static void main(String[] args) {
		InstanceOrder io = new InstanceOrder();
		
		new InstanceOrder(2, 5);
	}

}
