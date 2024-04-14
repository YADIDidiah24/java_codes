package lab10;

public class CircleDemo {
	public static void main(String[] args)
    {
        double r = 5.2;
        Circle c1 = new Circle(r);
        c1.computeCircumference();
        c1.computeArea();
        c1.prtShapeInfo();
    }
}
