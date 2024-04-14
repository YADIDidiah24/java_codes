package lab2;
import java.util.Scanner;

public class Boiler {
	public static void main(String args[])  {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter psi of the boiler: ");
		
		double output = input.nextDouble();
		System.out.println();
		if (output>1000) {
			System.out.println("Alarm: Boiler Pressure: TOO HIGH");
			
		} else if (output<100) {
			System.out.println("Boiler Pressure: TOO LOW");

		} else {
			System.out.println("Boiler Pressure: within normal limits.");
		}
		
		
	}
}
