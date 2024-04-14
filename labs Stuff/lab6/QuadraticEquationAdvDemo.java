package lab6;
import java.util.Scanner;

public class QuadraticEquationAdvDemo {
	public static void main(String args[]) {
		String st;
		QuadraticEquationAdv equation = new QuadraticEquationAdv();
		Scanner input=new Scanner(System.in);

do {
	System.out.print("Do you want to solve an equation (y/n): ");
	st= input.next();
			
	if (st.equals("n") || st.equals("N")) {
		System.out.println("Ending...");
		break;}
			
	equation.writeResult();

}  while (st.equals("y") || st.equals("Y"));

 
 }

		
}

