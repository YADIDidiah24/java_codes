package lab12;
import java.util.Scanner;

public class TrapezoidDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter dimention 1: ");
		double d1= input.nextDouble();
		System.out.println();
		System.out.print("Enter dimention 2: ");
		double d2= input.nextDouble();
		System.out.println();
		System.out.print("Enter Height: ");
		double h= input.nextDouble();
		System.out.println();
		
		Trapezoid t= new Trapezoid(d1,d2,h);
		t.computeArea();
		t.computeBorder();
		System.out.println();
		System.out.println("The Area of the Trapezoid is: "+ t.getArea());
		System.out.println();
		System.out.println("The Perimeter of the Trapezoid is: "+ t.getBorder());

	}

}
