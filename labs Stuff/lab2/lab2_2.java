package lab2;

public class lab2_2 {
	private int x;
    private float n;
    
    // Accessor (getter) and mutator (setter) methods for the instance variables
    public int getX()
    {
        return x;
    }
    
    public void setX(int x)
    {
        this.x=x;  // this operator needed to distinguish btw instance variable and 
                   // parameter
    }

    public float getN()
    {
        return n;
    }
    
    public void setN(float newN)
    {
        n = newN;  // No need for this operator here as instance var name and 
                   // parameter name are different
    }

    public static void main(String[] args) 
    {
    	lab2_2 jf = new lab2_2(); // create instance of the class
        jf.setX(9876); //use the setX() method to initialize x

        System.out.printf("Printing simple integer: x = %d\n", jf.getX());
                           // Note the use of getX() to retrieve value of x
 
        // this will print it upto 2 decimal places
        System.out.printf("Formatted with precision: PI = %.2f\n", Math.PI);
        jf.setN(5.2f);
 
        // automatically appends zero to the rightmost part of decimal
        System.out.printf("Formatted to specific width: n = %.4f\n", jf.getN());
 
        jf.setN(2324435.3f);  // reset the value of n for the object jf
 
        // here number is formatted from right margin and
        // occupies a width of 20 characters
        System.out.printf("Formatted to right margin: n = %20.4f\n", jf.getN());
    }

}
