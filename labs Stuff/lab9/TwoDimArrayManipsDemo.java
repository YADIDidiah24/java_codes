package lab9;
import java.util.Scanner;

public class TwoDimArrayManipsDemo {

	public static void main(String[] args) {
		
		TwoDimArrayManips obj = new TwoDimArrayManips(2,3);
		
		
		
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
		        	
		        	 obj.printMatrix( );
		              	break;
		         case 3:  
		        	 
		        	 System.out.print("enter the row to print: ");
		        	 int n1 = input.nextInt();
		        	 obj.printRow(n1);
		              	break;
		         case 4:  
		        	 
		        	 System.out.print("enter the col to print: ");
		        	 int n2 = input.nextInt();
		        	 obj.printCol(n2);
		              	break;
		              	
		         case 5:  
		        	
		        	 System.out.print("enter the row to reverse: ");
		        	 int n3 = input.nextInt();
		        	 obj.reverseRow(n3);
		        	 obj.printMatrix();
		              	break;
		         case 6:
		        	 System.out.println("breaking...");
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


