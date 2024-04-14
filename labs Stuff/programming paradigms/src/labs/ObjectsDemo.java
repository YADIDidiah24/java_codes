package labs;

public class ObjectsDemo {

	public static void main(String [] args) {
		
	
		
		GeoObject[] shapes = new GeoObject[4];
		
		shapes[0] = new GeoObject("white");
		shapes[1] = new Circle("green", 5);
		shapes[2] = new Rectangle("yellow",6,8);
		shapes[3] = new Triangle("red",7,9);
		
		
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].Paint();
		}
	}

}
