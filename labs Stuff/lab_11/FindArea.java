package lab_11;
import java.util.Scanner;

public class FindArea {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		Figure[] figArray = new Figure[3];
	
	
		
		
		figArray[0] = new Rectangle(5,8);
		figArray[1] = new Triangle(6,9);
		figArray[2] = new Trapezoid(7,5,4);
		
		for (Figure s : figArray)
		{
			s.area();
			System.out.println("Area is: " + s.getArea());
			System.out.println();
		}
		
}
	
}

