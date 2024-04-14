package assignment;
import java.util.Scanner;
public class checkBikeDemo {
	private static void printMenu() {
		System.out.println("(1) change speed of the bike.");
		System.out.println("(2) compute cadence of the bike ride.");
		System.out.println("(3) speedUp the bike.");
		System.out.println("(4) applyBrake on the bike.");
		//print attribute
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char decision, ch='N'; // to stop do-while loop
		int choice;  // switch case
		int gI =0, gCRT=0 , gCT=0 , g = 0, speed =0;// variables to store user input
		
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the number of bicycles to create: ");
			int n=input.nextInt(); //  to see how much storage must be allocated 
			Drives[] cycle = new Drives[n];

			for (int i=0;i<= n-1;i++) {
				System.out.print("Enter the type of vehicle to add: "); // bicycle or mountain bike
				String t=input.next();
				System.out.println();
				if (t.equals("bicycle")||t.equals("Bicycle")){     // if bicycle 
					System.out.print("Enter the speed of the Bicycle: ");
					speed = input.nextInt(); // get the value of speed
					cycle[i]= new Bicycle(speed); 
				
				} else if (t.equals("MountainBike")||t.equals("mountainbike")){ // else if mountain bike
					System.out.print("Enter the GearIncrement: ");       
					gI = input.nextInt();								
					System.out.print("Enter the GearChainRingTeeth: ");
					gCRT =input.nextInt();							  
					System.out.print("Enter the GearCogteeth: ");
					gCT =input.nextInt();	
					System.out.print("Enter the Gear: ");
					g = input.nextInt();	
					System.out.print("Enter the speed of the Bicycle: ");
					speed = input.nextInt(); 			// get all the parameter inputs from the user
					cycle[i]= new MountainBike(gI,gCRT,gCT,g,speed);
			}
					}
			do {
			System.out.println();
			printMenu();
			for (int i=0;i<cycle.length;i++) {
				
			
			System.out.println();
			System.out.print("Enter the number of the function to compute: ");
			
			choice= input.nextInt();
			System.out.println();
			
	       switch (choice) {	// switch case from the printMenu() function
	       case 1:  											
	       		System.out.println("Bicycle or MountainBike.");
	       		String v=input.next();
	       		if (v.equals("bicycle")||v.equals("Bicycle")){
					System.out.print("Enter the new speed of the Bicycle: ");
					speed = input.nextInt();
					cycle[i]= new Bicycle(speed);
				
				} else if (v.equals("MountainBike")||v.equals("mountainbike")){
					System.out.print("Enter the speed of the Bicycle: ");
					speed = input.nextInt();
					cycle[i]= new MountainBike(gI,gCRT,gCT,g,speed);
			}
	       		
	              	break;
	         case 2: 
	        	 MountainBike b = new MountainBike(gI,gCRT,gCT,g,speed);
	        	 b.computeCadence();
	        	
	        	 
	        	 System.out.println();
	        	 
	        	 b.PrintAttribute();
	        	 
	        	 
	              	break;
	         case 3:  
	        	 System.out.println("Enter the increased speed: ");
	 			int n1=input.nextInt();
	        	 cycle[i].speedUp(n1);
	        	
	        	 break;
	         case 4:  
	        	 System.out.println("Enter the decreased speed: ");
	 			int n2=input.nextInt();
	        	 cycle[i].applyBrake(n2);
	        	 
	        	 break;
	         

	         default:
	        	 System.out.println("Error, Wrong input");
				
	                break;       
	       }
	       }
			System.out.print("Do you like to do another service ? (Y/N): ");
		       decision = input.next().charAt(0);       
		       } while (decision == 'y' || decision == 'Y');     // if decision is not Y then code ends 
	}

}
