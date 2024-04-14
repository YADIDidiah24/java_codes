package Lab_5;

import java.util.Scanner;

public class ComputeAverage1Demo {
	public static void main(String[] args) {
		computeaverage1 method = new computeaverage1();
		int a, b, c;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 integers separated by spaces:   ");

		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		System.out.println("\n Using first version \n");
		System.out.printf("Average of the numbers entered is: %.3f \n", method.compAvg(a, b, c));

		System.out.println("\n Using second version \n");
		method.compAvg();

	}
}
