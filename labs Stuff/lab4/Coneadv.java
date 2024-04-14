package lab4;
import java.util.Scanner;
import java.lang.Math;

public class Coneadv {
	private double height;
	private double radius;
	double area;
	double volume;
	final double pi = 3.14;
	
	public Coneadv() {
		height = 10;
		radius = 5;	
	}
	
	public Coneadv(double h , double r) {
		height = h;
		radius = r;
	}
	
	
	public void setH(double ht) {
		this.height = ht;
	}
	
	public double getHt() {
	
		return height;

	}
	
	public void setr(double rd) {
		this.radius = rd;
	}
	
	public double getRd() {
	
		return radius;

	}
	
	
	
	public static void main(String args[]) {
		
		char decision; 

		Coneadv object1 = new Coneadv();
	
		Scanner input = new Scanner(System.in);

		do {
		       System.out.print("Do you like to start Cone data computation? (Y/N): ");
		       decision = input.next().charAt(0); // reads the 1st char only 
		   
		       switch (decision)
		       {
		       	case 'N':
				case 'n': 
		         		System.out.println("You choice is to stop! Ok. exiting !!!");
		               	System.exit(0);
		              	break;
		         case 'Y':
		         case 'y':
				 System.out.println();
	
				System.out.print("Input the Value of height: ");
	
				double height1 = input.nextDouble();
				System.out.print("Input the Value of radius: ");
	
				double radius1 = input.nextDouble();
				
			
			
			
			object1.setH(height1);
			object1.setr(radius1);
			
			double h = object1.getHt();
			double r = object1.getRd();

			
			double area1 = object1.pi * r *(r+Math.sqrt((h*h)+(r*r)));
			double volume1 = object1.pi * (r*r)* (h/3);
			
			 System.out.println();

			System.out.println("The Area is: "+ area1);
			System.out.println("The Volume is: "+ volume1);
			System.out.println("");

		                break;

		     default:
					    System.out.println("Wrong Input! ");
		                    break;       
		       } // end switch
		       System.out.print("Do you like to start Cone data computation? (Y/N): ");
		       decision = input.next().charAt(0);
		       if (decision=='n'||decision== 'N') {
	         		System.out.println("Ok. exiting !!!");

		       }
		    	   }
		 while (decision == 'y' || decision == 'Y');
	
	input.close();
 } 
	

 }

		
		
		
		
		

		





