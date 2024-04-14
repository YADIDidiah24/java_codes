package lab12;

public class Rectangle extends Shape
{
	protected double myWidth;
	protected double myHeight;
	protected double border;
	protected double area;
    

    public Rectangle (double width, double height)
    {
        myWidth = width;
        myHeight = height;
    }


    public void computeBorder()
    {
        border =  2 * (myWidth + myHeight);
    }

    public double getBorder()
    {
    		return border;
    }
    public void computeArea(){
    	area = myWidth * myHeight;

    }
    public double getArea ()
    {
        return area;
    }


	

}

	
	
	
