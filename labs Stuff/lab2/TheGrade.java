package lab2;
import java.util.Scanner;


public class TheGrade {
	public static void main(String args[])  {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Numeric Grade of the marks: ");
		
		double Grade = input.nextDouble();
		
		System.out.println();
		if (Grade>=90) {
			System.out.println("Grade = A");
			
		} else if (Grade>=80) {
			System.out.println("Grade = B");

		} else if (Grade>=70) {
			System.out.println("Grade = C");

		} else if (Grade>=60) {
			System.out.println("Grade = D");

		} else {
			System.out.println("Grade = F");

		}
		
		
	}
}


