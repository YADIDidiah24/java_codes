package lab10;

public class Cylinder extends Sphere {
	public Cylinder(double r) {
		super(r);
	}
	public double height;
	
	public void printMenu() {
		System.out.println("This program provides the following Cylinder services: ");
		System.out.println(" 1.	Set Height (using the method 'setHeight()' )");
		System.out.println(" 2.	Compute volume (using the method 'computeVolume()' )");
		System.out.println(" 3.	Get volume (using the method 'getVolume()' )");
		System.out.println(" 4.	Print Shape info (using the method 'prtShapeInfo() ' )");
		System.out.println(" 5.	Quit");
	}
	public void setHeight(double h) {
		height=h;
	}
	
	public double getVolume() {
		return volume;
	}
	public void computeVolume() {
		volume = Math.PI * Math.pow(radius,2)*height;
		
	}
	public void prtShapeInfo() {
		System.out.println();
		System.out.println("Radius of the Cylinder is "+ radius);
        System.out.println("Height of the Cylinder is " + height);
        System.out.println("Volume of the Cylinder is " + volume);
        System.out.println();
	}

}
