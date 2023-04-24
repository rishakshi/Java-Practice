package wiley_core_java;

abstract class Vehicle {
	
	protected String color;
	protected int speed;
	protected int numWheels;
	
	public Vehicle(String color, int speed, int numWheels) {
		this.color = color;
		this.numWheels = numWheels;
		this.speed = speed;
	}
	
	public abstract void move();
	
}

class Car extends Vehicle{

	public Car(String color, int speed, int numWheels) {
		super(color, speed, numWheels);
	}

	@Override
	public void move() {
		System.out.println("Move left or right");
		
	}
	
}

public class CarAbstract {
	
	public static void main(String[] args) {
		
		Car c = new Car("A", 12, 4);
		c.move();
		
	}

}
