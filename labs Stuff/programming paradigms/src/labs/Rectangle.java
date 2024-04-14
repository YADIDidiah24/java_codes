package labs;

public class Rectangle extends GeoObject {
	private float Width;
	private float Height;

	public Rectangle(String c,float w,float h) {
		super(c);
		this.Width=w;
		this.Height=h;
	}
	public void Paint() {
		super.Paint();
		System.out.println("the width is "+ Width);
		System.out.println("the height is "+ Height);
		System.out.println();
				
	}
}
