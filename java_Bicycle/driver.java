package assignment;
import java.util.Scanner;
public class driver {
	private static void printMenu() {
		System.out.println("(1) change speed of the bike.");
		System.out.println("(2) compute cadence of the bike ride.");
		System.out.println("(3) speedUp the bike.");
		System.out.println("(4) applyBrake on the bike.");
		
	}
	
	public static void main(String[] args) {
		int speed =0;
		char decision, ch='N';
		int choice;
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		Drives[] cycle = new Drives[n];
		for (int i=0;i<= n-1;i++) {
			System.out.print("Enter the type of vehicle to add: ");
			String t=input.next();
			System.out.println();
			if (t.equals("bicycle")||t.equals("Bicycle")){
				System.out.print("Enter the speed of the Bicycle: ");
				speed = input.nextInt();
				cycle[i]= new Bicycle(speed );// any value or use scanner input
			
			} else if (t.equals("MountainBike")||t.equals("mountainbike")){
				
				cycle[i]= new MountainBike(1,1,1,1,1 );// get input from user
		}
	}
		System.out.println();
		printMenu();
		for (int i=0;i<cycle.length;i++) {
			
		
		System.out.println();
		System.out.print("Enter the number of the function to compute: ");
		
		choice= input.nextInt();
		System.out.println();
	do {
       switch (choice) {
       case 1:  
       		System.out.println("Bicycle or MountainBike.");
       		String v=input.next();
       		if (v.equals("bicycle")||v.equals("Bicycle")){
				System.out.print("Enter the new speed of the Bicycle: ");
				speed = input.nextInt();
				cycle[i]= new Bicycle(0);
			
			} else if (v.equals("MountainBike")||v.equals("mountainbike")){
				System.out.print("Enter the speed of the Bicycle: ");
				speed = input.nextInt();
				cycle[i]= new MountainBike(1,1,1,1,1);
		}
       		
              	break;
         case 2: 
        	 MountainBike b = new MountainBike(1,1,1,1,1);
        	 b.computeCadence();
        	 System.out.println("Cadence is: " + b.getCadence());
        	 
        	 System.out.println();
        	 
        	 b.PrintAttribute();
        	 
        	 
              	break;
         case 3:  
        	 System.out.println("Enter the increased speed: ");
 			int n1=input.nextInt();
        	 cycle[i].speedUp(n1);
        	 System.out.println("Speed is: "+ speed);
        	 break;
         case 4:  
        	 System.out.println("Enter the decreased speed: ");
 			int n2=input.nextInt();
        	 cycle[i].applyBrake(n2);
        	 System.out.println("Speed is: "+ speed);
        	 break;
         

         default:
        	 System.out.println("Error, Wrong input");
			
                break;       
       }
       
		System.out.print("Do you like to do another service ? (Y/N): ");
	       decision = input.next().charAt(0);       
	       } while (decision == 'y' || decision == 'Y');
}

}}
