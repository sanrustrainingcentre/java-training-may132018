package _abstract;

public abstract class BmwCar extends Car {
	
	protected void accelerate() {
		System.out.println("Bmw way of accelerating their cars.");
	}
	
	void stop() {
		System.out.println("Bmw way of stopping their cars.");
	}
	
	void changeGearLevel(int gearLevel) {
		System.out.println("Bmw way of changing gears.");
	}

}
