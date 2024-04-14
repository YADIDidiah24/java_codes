package lab_11;

public class Triangle extends Rectangle {
	Triangle(double a,double b){
		super(a,b);
	}
	public void area() {
		area = (dim1 * dim2)/2;
		
	}
	public double getArea() {
		return area;
	}
}
