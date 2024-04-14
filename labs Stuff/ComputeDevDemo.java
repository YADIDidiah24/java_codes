import java.util.Scanner;


public class ComputeDevDemo {
	public static void main(String args[]) {
		char decision;
		Scanner input=new Scanner(System.in);
		
		
		do {
			System.out.print("Do you want to compute standard deviation (y/n): ");
			
			decision = input.next().charAt(0);
			switch (decision)
			{
				case 'N':
				case 'n': 
			  		System.out.println("You choice is to stop! Ok. exiting !!!");
			        	
			       	break;
			  case 'Y':
			  case 'y':
				  System.out.print("What is the size of the array? : ");
				  int n=input.nextInt();
				  ComputeDev obj = new ComputeDev(n);
				  obj.readInput();
				  obj.ComputeStDev();
				  obj.writeOutput();

			         break;

			default:
					    System.out.println("Wrong Input! ");
			             break;       
			}
			System.out.print("Do you like to start Cone data computation? (Y/N): ");
			decision = input.next().charAt(0);
			if (decision=='n'||decision== 'N') {
					System.out.println("Ok. exiting !!!");

			}

		}  while (decision==('y') || decision ==('Y'));

		input.close();
		 }
		
		
	}



