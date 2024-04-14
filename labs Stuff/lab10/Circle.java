package lab10;

public class Circle {
	protected double radius;   	  
    protected double area; 
    protected double circumference;
   
	public void printMenu() {
		System.out.println("This program provides the following Circle services: ");
		System.out.println(" 1.	set Radius (using the method 'setRadius()' )");
		System.out.println(" 2.	Compute circumference (using the method 'computeCircumference()' )");
		System.out.println(" 3.	Compute area (using the method 'computeArea()' )");
		System.out.println(" 4.	Get radius (using the method 'getRadius()' )");
		System.out.println(" 5.	Get circumference (using the method 'getCircumference()' )");
		System.out.println(" 6.	Get area (using the method 'getArea()' )");
		System.out.println(" 7.	Print Shape info (using the method 'prtShapeInfo() ' )");
		System.out.println(" 8.	Quit");
	}
    public Circle (double r)
    {
        radius=r;   	  
        area=0; 
        circumference=0;
    }

    public void setRadius( double r)
    {
	radius=r;  
    }
    public double getRadius( )
    {
	return radius;
    }
	

    public double getCircumference( )
    {
	return circumference;
    }
	
    public double getArea( )
    {
	return area;
    }


    public void prtShapeInfo() 
    {
    	System.out.println();
    	System.out.println("Radius is " + radius);
        System.out.println("circumference of the circle is " + circumference);
        System.out.println("Area of the circle is  " + area);
        System.out.println();
    }   
    
    public void computeCircumference()
    {
        circumference = 2 * Math.PI * radius;
    }
    
    public void computeArea()
    {
        area = Math.PI * radius*radius;
    }
    
}
