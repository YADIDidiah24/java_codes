package lab6;

import java.util.Scanner;

public class QuadraticEquationAdv {
	private  double a,b,c, root1, root2;  
	
	public double getInput() {
		Scanner input=new Scanner(System.in);
		

		double ans = input.nextDouble();
		
		return(ans);
		
	}
	public double compDisc() {
		System.out.print("Enter the value of a: ");
		this.a=getInput();
		System.out.print("Enter the value of b: ");
		this.b=getInput();
		System.out.print("Enter the value of c: ");
		this.c=getInput();
        double disc = ((b*b)-(4*a*c)); 
        return disc;

	}
	
	
	public void computeRoots() {
		double disc1 = compDisc();
		root1 = (((-b) +(Math.sqrt(disc1)))/(2*a));
		root2 = (((-b) -(Math.sqrt(disc1)))/(2*a));
	}
	public void writeResult() {
		double disc2 = compDisc();
		if (a==0) { System.out.println("no real roots exist.");
		} else if (disc2<0) 
		{System.out.println("no real roots exist.");}
		 
		else if (disc2 ==0) {
			System.out.println("only one root exists.");
			double root = (-b/(2*a));
			System.out.println("The root is: "+ root);
		}
		else if (disc2>0) {
			root1 = (((-b) +(Math.sqrt(disc2)))/(2*a));
			root2 = (((-b) -(Math.sqrt(disc2)))/(2*a));
			System.out.println();

			System.out.println("The first root is: "+ root1);
			System.out.println();

			System.out.println("The second root is: "+ root2);


		}
		
	}
	
	
}
