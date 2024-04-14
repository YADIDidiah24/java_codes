package lab2;
import java.util.Scanner;

public class SwitcherEx {
	private double val1;
	private double val2;
	
    public double getVal1() {
    	return val1;
    }
    
    public void setVal1(double val1) {
    	this.val1 = val1;
    }
    
    public double getVal2() {
    	return val2;
    }
    
    public void setVal2(double val2) {
    	this.val2 = val2;
    }
   
	
	public static void main(String args[]) {
				
		SwitcherEx value= new SwitcherEx();
		
			
		
		value.setVal1(10);
		
		if ((value.getVal1()) == 0.0 || value.getVal2()==0.0 ) {
			Scanner input = new Scanner(System.in);
			System.out.print("Input the First number: ");
			double f = input.nextDouble();
			
			System.out.print("Input the second number: ");
			double s = input.nextDouble();
			
			
			value.setVal1(f);
			value.setVal2(s);
		}
		
		
		if (!(value.getVal1()<value.getVal2())) {
			double temp= value.getVal1();
			double value1= value.getVal1();
			double value2 = value.getVal2();
			
			  temp = value1;
			  value1 = value2;
			  value2 = temp;
			  
			
			  System.out.println("The first value is Exchanged making it: "+value1);
			  System.out.println("The second value is Exchanged making it: "+value2);
	
		  }else {
			
			System.out.println("The first value is less than second, so no exchange required.");
	
				}
				
				
				
			}
}
