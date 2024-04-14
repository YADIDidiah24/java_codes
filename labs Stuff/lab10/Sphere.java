package lab10;

public class Sphere extends Circle {
	protected double volume;
	
	public Sphere(double r) {
		super(r);
		
	}
	
	public void printMenu() {
		System.out.println("This program provides the following Sphere services: ");
		System.out.println(" 1.	set radius (using the method 'setRadius()' )");
		System.out.println(" 2.	Compute volume (using the method 'computeVolume()' )");
		System.out.println(" 3.	Get volume (using the method 'getVolume()' )");
		System.out.println(" 4.	Print Shape info (using the method 'prtShapeInfo() ' )");
		System.out.println(" 5.	Quit");
	}
	public double getVolume() {
		return volume;
	}
	
	public void computeVolume() {
		volume = (4/3)*Math.PI*Math.pow(radius, 3);
	}
	
	public void prtShapeInfo() {
		System.out.println();
		System.out.println("Radius of the sphere is "+ radius);
        System.out.println("Volume of the sphere is " + volume);
        System.out.println();
	}
	
}

