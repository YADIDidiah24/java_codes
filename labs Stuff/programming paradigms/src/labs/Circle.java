package labs;

public class Circle extends GeoObject {
	private float Radius;
	public Circle(String c,float r) {
		super(c);
		this.Radius=r;
	}
	public void Paint() {
		super.Paint();
		System.out.println("the radius is "+ Radius);
		System.out.println();
	}
}
