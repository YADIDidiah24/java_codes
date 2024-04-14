package lab6;
import java.util.Scanner;
public class grade {
	
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
    

	System.out.print("Input the grade in integer : ");
	
	int grade = input.nextInt();
	
	System.out.println();
	
	grade=grade/10;
	
	switch (grade) {
	
	case 9:
		System.out.println("the letter grade is A");
		break;
	case 8:
		System.out.println("the letter grade is B");
		break;
	case 7:
		System.out.println("the letter grade is C");
		break;
	case 6:
		System.out.println("the letter grade is D");
		break;
	default:
	    System.out.println("the letter grade is F");
	
	}
	input.close();
	}
	
}
