package lab_11;

public class Figure {
	protected double dim1;
	protected double dim2;
	protected double area;
	
	Figure(double a, double b) {
	dim1 = a;
	dim2 = b;
	}
	public void area() {
	System.out.println("Area for Figure is undefined.");
	

	}
	public double getArea() {
		return area;
	}

}
