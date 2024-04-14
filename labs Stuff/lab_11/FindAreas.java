package lab_11;

import java.util.Scanner;

public class FindAreas {
	
	public static void printMenu() {
		System.out.println("There are 3 functions to compute in the menu choose (1,2 or 3)");
		
		System.out.println("compute area for Rectangle. ");
		System.out.println("compute area for Triangle. ");
		System.out.println("compute area for Trapezoid. ");
		
	}
	
	
public static void main(String[] args) {
	
	Figure[] figArray = new Figure[3];
	
	printMenu();
	
	Scanner input= new Scanner(System.in);
		char decision;
		int choice;   
		
		   do { 
				
			   System.out.println();
				System.out.print("which function to compute: ");
				choice = input.nextInt();
				switch (choice) {
				
					
				case 1:
					
					System.out.print("Enter the Length: ");
					double l1 =input.nextDouble();
					System.out.println();
					System.out.print("Enter the Width: ");
					double w1 =input.nextDouble();
					figArray[0] = new Rectangle(l1,w1);
					figArray[0].area();
					System.out.println();
					System.out.println("the area of the Rectangle is: "+ figArray[0].getArea());
					break;
					
				case 2:
					System.out.print("Enter the Length: ");
					double l2 =input.nextDouble();
					System.out.println();
					System.out.print("Enter the Width: ");
					double w2 =input.nextDouble();
					figArray[1] = new Triangle(l2,w2);
					figArray[1].area();
					System.out.println();
					System.out.println("the area of the Triangle is: "+ figArray[1].getArea());
					break;
				
				case 3:
					System.out.print("Enter the Length: ");
					double l3 =input.nextDouble();
					System.out.println();
					System.out.print("Enter the Width: ");
					double w3 =input.nextDouble();
					System.out.print("Enter the Height: ");
					double h3 =input.nextDouble();
					figArray[2]= new Trapezoid(l3,w3,h3);
					figArray[2].area();
					System.out.println();
					System.out.println("the area of the Trapezoid is: "+ figArray[2].getArea());
					break;
				
				
				case 4:
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
