package assignment;

public class Bicycle implements Drives {
	
	protected int cadence;
	protected int gear;		
	protected int speed;
	// protected as some variables need to be used in subclass. 
	
	public Bicycle(int speed) {
		this.speed = speed;
		// the argument of the constructor will be stored in the var speed.
	}
	
	

	// set and get methods for Cadence and gear.
	public void setCadence(int c) {
		cadence=c;
		
	}
	public int getCadence() {
		return cadence;
	}
	public void setGear(int g) {
		gear = g;
		
	}
	public int getGear() {
		return gear;
	}
	
	// Prints all the values of instance variables.
	
	public void PrintAttribute() {
		System.out.println("The speed is" + speed);
		System.out.println("The cadence is" + cadence);
		System.out.println("The gear is" + gear);
	}
	
	public void applyBrake(int decrement) {
		speed -= decrement;
		System.out.println("Speed is: "+ speed);
		//decreases speed
	}

	
	public void speedUp(int increment) {
		System.out.println("Speed is: "+ speed);
		// increases speed
	}

}
