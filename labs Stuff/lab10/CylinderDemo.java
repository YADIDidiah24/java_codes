package lab10;
import java.util.Scanner;

public class CylinderDemo {

		
		public static void main(String[] args)
		
		
	    {
			Scanner input= new Scanner(System.in);
			System.out.print("Enter the radius: ");
			
	        double r= input.nextDouble();
	        
	        Cylinder cy1 = new Cylinder(r);
	        
	        
	        cy1.setHeight(5);
	        cy1.computeVolume();
	        cy1.prtShapeInfo();
	        
	        
	        input.close();
	    }
	}


