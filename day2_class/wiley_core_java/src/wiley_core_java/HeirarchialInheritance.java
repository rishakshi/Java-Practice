package wiley_core_java;

class Vehicle1 {
	public void steering() {
		System.out.println("Steering");
	}
}
       
class Car1 extends Vehicle1{
	public void airbag() {
		System.out.println("Airbag");
	}
}

class Truck extends Vehicle1{
	public void HydraulicPump() {
		System.out.println("Hydraulic Pump");
	}
}

public class HeirarchialInheritance {
	
	public static void main(String[] args) {
		Car1 c = new Car1();
		c.airbag();
		c.steering();
		
		Truck t = new Truck();
		t.HydraulicPump();
		t.steering();
		
		Vehicle1 v = new Vehicle1();
		v.steering();
	}

}
