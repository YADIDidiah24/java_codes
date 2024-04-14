package labs;

public class Triangle extends GeoObject {
	Position p;
	public Triangle(String color,float B, float C) {
		
		super(color);
		p = new Position();
		p.setX(B);
		p.setY(C);
		
	}
	public void Paint() {
		super.Paint();
		System.out.println("the Position of B is "+ p.getX());
		System.out.println("the Position of C is "+ p.getY());
		System.out.println();

	}
}
