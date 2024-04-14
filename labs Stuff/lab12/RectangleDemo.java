package lab12;
import java.util.Scanner;

public class RectangleDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Width: ");
		double w= input.nextDouble();
		System.out.println();
		System.out.print("Enter Height: ");
		double h= input.nextDouble();
		Rectangle r= new Rectangle(w,h);
		r.computeArea();
		r.computeBorder();
		System.out.println("The Area of the rectangle is: "+ r.getArea());
		System.out.println();
		System.out.println("The Perimeter of the rectangle is: "+ r.getBorder());

	}

}
