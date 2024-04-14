package lab8;
import java.util.Scanner;

public class ArrayManipsDemo {
	public static void main(String[] args) {
		ArrayManips obj = new ArrayManips(3);
		
		Scanner input = new Scanner(System.in);
		
		
		char decision, ch='N';
		int choice;     
		   do { 
				obj.printMenu();
				System.out.println();
				System.out.print("Enter the number of the function to compute: ");
				
				choice= input.nextInt();
				System.out.println();
		       switch (choice)
		       {
		       	case 1:  
		       		obj.readInput();
		              	break;
		         case 2: 
		        	 obj.readInput();
		        	 obj.reverseRow();
		              	break;
		         case 3:  
		        	 obj.readInput();
		        	 obj.findRowPrimes();
		              	break;

		         default:
		        	 System.out.println("Error, Wrong input");
					
		                break;       
		       }
		       System.out.print("Do you like to do another service ? (Y/N): ");
		       decision = input.next().charAt(0);       
		       } while (decision == 'y' || decision == 'Y');

	}
}
