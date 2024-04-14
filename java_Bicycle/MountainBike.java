package assignment;

public class MountainBike extends Bicycle{
	 private int gearIncrement; // this is local variable to get from user.
	 private int GearChainRingTeeth; 
	 private int GearCogteeth;
	 private float GearRatio;  // this is a local variable to store computed result.

	 public MountainBike(int gearIncrement, int GearChainRingTeeth, int GearCogteeth, int gear, int speed) {
			//parameterised constructor
			super(speed); // calls the Bicycle constructor and sets the value of speed
			
			this.gearIncrement = gearIncrement;
			this.GearChainRingTeeth = GearChainRingTeeth;
			this.GearCogteeth = GearCogteeth;
			this.gear = gear;
			// stores the argument values in instance variables 
			GearRatio = GearChainRingTeeth / GearCogteeth;	
		}
	
	
	


	public void speedUp(int gearIncrement) {
		this.gearIncrement = gearIncrement;
		// variable gearIncrement gets passed on the argument value when calling this function
		speed = speed * 2 * gearIncrement;
		// increases speed 
		System.out.println("Speed is: "+ speed);
	}
	
	public void computeCadence() {
		cadence = (int) (speed / (0.79 * GearRatio));
		System.out.println("Cadence is: " + cadence);
		// sets cadence to int as in the bicycle class the cadence data type is int.
	}
	public void PrintAttribute() {
		System.out.println("The gearIncrement is: " + gearIncrement);
		System.out.println("The GearChainRingTeeth is: " + GearChainRingTeeth);
		System.out.println("The GearCogteeth is: " + GearCogteeth);
		System.out.println("The GearRatio is: " + GearRatio);
		System.out.println("The speed is: "+ speed);
		System.out.println("The gear of the bike is: "+ gear);
		// Prints all the instance variables
	}
	
	
}
