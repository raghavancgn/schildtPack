package schildtPack;
interface Vehicle {
	//all are abstract methods
	void changeGear(int a);
	void speedUp(int a);
	void applyBreaks(int a);
}

class Bicycle implements Vehicle{
	int speed;
	int gear;
	
	//to change the gear
	@Override
	public void changeGear(int newGear) {
		gear = newGear;
	}
	
	//to increase speed
	@Override
	public void speedUp(int increment) {
		speed = speed + increment;
	}
	
	//to decrease the speed
	@Override
	public void applyBreaks(int decrement) {
		speed = speed - decrement;
	}
	
	public void printStates() {
		System.out.println("speed = " + speed + " gear = " + gear);
	}
}

class Bike implements Vehicle {
	int speed;
	int gear;
	//to change the gear
		@Override
		public void changeGear(int newGear) {
			gear = newGear;
		}
		
		//to increase speed
		@Override
		public void speedUp(int increment) {
			speed = speed + increment;
		}
		
		//to decrease the speed
		@Override
		public void applyBreaks(int decrement) {
			speed = speed - decrement;
		}
		
		public void printStates() {
			System.out.println("speed = " + speed + " gear = " + gear);
		}
}
//driver to test the interface
public class GFG {
	public static void main(String[] args) {
		//creating an instance of Bicycle 
		//doing some operations
		
		Bicycle bicycle = new Bicycle();
		bicycle.changeGear(2);
		bicycle.speedUp(3);
		bicycle.applyBreaks(1);
		
		System.out.println("Bicycle present state: ");
		bicycle.printStates();
		
		//creating instance for bike
		Bike bike = new Bike();
		bike.changeGear(1);
		bike.speedUp(4);
		bike.applyBreaks(3);
		
		System.out.println("Bike present state: ");
		bike.printStates();
	}
}