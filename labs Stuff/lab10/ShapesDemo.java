package lab10;

import java.util.Scanner;


public class ShapesDemo {
public static void main(String[] args) {
		
	Scanner input= new Scanner(System.in);
		char decision, ch='N';
		int choice;   
		String shape;
		   do { 
				
			
				System.out.print("Enter the shape to find: ");
				shape = input.next();
				
				if (shape.equals("circle")|| shape.equals("CIRCLE")) {
					System.out.print("Enter the radius: ");
					
				    double r= input.nextDouble();
				    
				    Circle c1 = new Circle(r);
				    System.out.println();
					c1.printMenu();
					System.out.println();
					System.out.print("Enter the number of the function to compute: ");
					
					choice= input.nextInt();
					System.out.println();
					switch (choice)
				       {
				       	case 1:  
				       		System.out.print("enter the radius: ");
				        	 double n1 = input.nextDouble();
				        	 c1.setRadius(n1);
				       		
				              	break;
				        
				         case 2: 
				        	
				        	 c1.computeCircumference();
				              	break;
				         case 3:  
				        	 
				        	 c1.computeArea();
				              	break;
				         case 4:  
				        	 
				        	 c1.getRadius();
				              	break;
				              	
				         case 5:  
				        	
				        	 c1.getCircumference( );
				              	break;
				         case 6:
				        	 c1.getArea();
				        	 break;
				         case 7:
				        	 c1.prtShapeInfo();
				         case 8:
				        	 System.out.println("breaking...");
				        	 break;
				         default:
				        	 System.out.println("Error, Wrong input");
							
				                break;
				         
				       }
				} else if (shape.equals("sphere") || shape.equals("SPHERE")){
					
					System.out.print("Enter the radius: ");
					
				    double r= input.nextDouble();
				    Sphere s1 = new Sphere(r);
				    System.out.println();
				    
					s1.printMenu();
					System.out.println();
					System.out.print("Enter the number of the function to compute: ");
					
					choice= input.nextInt();
					System.out.println();
					switch (choice)
				       {
				       case 1: 
				    	   System.out.print("enter the radius: ");
				        	 double n = input.nextDouble();
				       		s1.setRadius(n);
				       		
				              	break;
				       	case 2:  
				       		s1.computeVolume();
				       		
				              	break;
				        
				         case 3: 
				        	 s1.getVolume();
				              	break;
				         case 4:  
				        	 
				        	 s1.prtShapeInfo();
				              	break;
				         case 5:  
				        	 System.out.println("breaking...");
				        	 break;

				         default:
				        	 System.out.println("Error, Wrong input");
							
				                break;
				}
				
				} else if (shape.equals("cylinder") || shape.equals("CYLINDER")) {

					System.out.print("Enter the radius: ");
					
				    double r= input.nextDouble();
				    Cylinder cy1 = new Cylinder(r);
				    System.out.println();
					cy1.printMenu();
					System.out.println();
					System.out.print("Enter the number of the function to compute: ");
					
					choice= input.nextInt();
					System.out.println();
					switch (choice)
				       {
				       	case 1:  
				       		System.out.print("enter the radius: ");
				        	 double n2 = input.nextDouble();
				        	 cy1.setHeight(n2);
				       		
				              	break;
				        
				         case 2: 
				        	 cy1.computeVolume();
				              	break;
				         case 3:  
				        	 
				        	 cy1.getVolume();
				              	break;
				         case 4:  
				        	 cy1.prtShapeInfo();
				        	 break;
				         case 5:  
				        	 System.out.println("breaking...");
				        	 break;

				         default:
				        	 System.out.println("Error, Wrong input");
							
				                break;
				}
				} 
				else {
					System.out.println("Wrong Input!!! ");
					break;
				}
				
		       System.out.print("Do you like to do another service ? (Y/N): ");
		       decision = input.next().charAt(0);       
		       } while (decision == 'y' || decision == 'Y');

	}
}
