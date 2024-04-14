package lab_11;

public class Trapezoid extends Triangle {
	private double height;
	Trapezoid(double a,double b,double h){
		super(a,b);
		height=h;
	}
	public void area() {
		area = height*((dim1 + dim2)/2);
		
	}
	public double getArea() {
		return area;
	}
}
