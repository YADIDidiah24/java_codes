package lab12;
import java.util.Scanner;
public class Trapezoid extends Rectangle{
	private double height;
	
	private double dim3,dim4;
	public Trapezoid(double dim1,double dim2, double h) {
		super(dim1,dim2);
        height=h;
	}
	@Override
	public void computeBorder() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter dimention 3: ");
		dim3= input.nextDouble();
		System.out.println();
		System.out.print("Enter dimention 4: ");
		dim4= input.nextDouble();
		
		border = myWidth+myHeight+dim3+dim4;
		
	}
	
	public void computeArea() {
		area = height * (myWidth + myHeight)/2;
		
	}
}
