package labs;

public class GeoObject {
	public String color;
	Position p;
	public GeoObject(String c) {
		
		this.color = c;
		
	}
	
	public void Paint() {
		System.out.println("the color is "+ color);
		
	}
	
}
