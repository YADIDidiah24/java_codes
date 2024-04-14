package lab10;
import java.util.Scanner;

public class SphereDemo {
	
	public static void main(String[] args)
	
	
    {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the radius: ");
		
        double r= input.nextDouble();
        
        Sphere s1 = new Sphere(r);
        
        Circle c1 = new Circle(r);
        
        s1.computeVolume();
        s1.prtShapeInfo();
        c1.computeCircumference();
        c1.computeArea();
        c1.prtShapeInfo();
        
        
        input.close();
    }
}
