package lab6;
import java.util.Scanner;
import java.lang.Math; 

public class QuadraticEquation {
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		double a,b,c, root1, root2;   
		String st;
		int n=0;
		do {
			
			System.out.print("Do you want to solve an equation (y/n): ");
			st= input.next();
			
			if (st.equals("n") || st.equals("N")) {
				System.out.println("Ending...");
				break;
			
			}
			
			
			
		
			System.out.print("Enter the value of a: ");
			a=input.nextDouble();
			System.out.print("Enter the value of b: ");
			b=input.nextDouble();
			System.out.print("Enter the value of c: ");
			c=input.nextDouble();
        double delta = ((b*b)-(4*a*c)); 
  
			if (a==0) { System.out.println("no real roots exist.");
			} else if (delta<0) 
			{System.out.println("no real roots exist.");}
			 
			else if (delta ==0) {
				System.out.println("only one root exists.");
				double root = (-b/(2*a));
				System.out.println("The root is: "+ root);
			}
			else if (delta>0) {
				root1 = (((-b) +(Math.sqrt(delta)))/(2*a));
				root2 = (((-b) -(Math.sqrt(delta)))/(2*a));
				System.out.println();

				System.out.println("The first root is: "+ root1);
				System.out.println();

				System.out.println("The second root is: "+ root2);


			}
			if (n==3) {
				System.out.println();
				System.out.println("Quitting...");
				
				break;
			}
			
  
	
		
			
	}  while (st.equals("y") || st.equals("Y"));

 input.close();
 }
}
