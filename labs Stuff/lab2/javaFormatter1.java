package lab2;
import java.text.DecimalFormat;
public class javaFormatter1 {
	private double num;
	
	

    public double getN()
    {
        return num;
    }
    
    public void setNum(double num)
    {
        this.num=num; 
    }
	public static void main(String args[])
    {
		javaFormatter1 fmtN = new javaFormatter1();
		fmtN.setNum(458.974);
        // prints only numeric part of a floating number
        DecimalFormat ft = new DecimalFormat("####");
        System.out.println("Without fraction part: num = "
                           + ft.format(fmtN.getN()));
 
        // this will print it upto 2 decimal places
        ft = new DecimalFormat("#.##");
        System.out.println("Formatted to Give precision: num = "
            + ft.format(fmtN.getN()));
 
        // automatically appends zero to the rightmost part
        // of decimal instead of #,we use digit 0
        ft = new DecimalFormat("#.000000");
        System.out.println("appended zeroes to right: num = "
            + ft.format(fmtN.getN()));
 
        // automatically appends zero to the leftmost of
        // decimal number instead of #,we use digit 0
        ft = new DecimalFormat("00000.00");
        System.out.println("formatting Numeric part : num = "
            + ft.format(fmtN.getN()));
 
        // formatting money in dollars
        double income = 23456.789;
        ft = new DecimalFormat("$###,###.##");
        System.out.println("your Formatted Dream Income: "
                           + ft.format(income));
    }

}
