package Lab_5;
import java.util.Scanner;



public class compute {
	
	
	
	    public static void main(String[] args) {
	        int a,b,c, sum=0;
	        double average;
	        Scanner input = new Scanner(System.in);
	        System.out.println ("Enter 3 integers separated by spaces:   ");
	        a = input.nextInt();
	        b = input.nextInt();
	        c = input.nextInt();
	        
	        sum+=(a+b+c);
	        average = (double) sum/3.0;   
	        System.out.printf("Average of the numbers entered is: %.3f \n", average);
	        input.close();
	    }
	}


