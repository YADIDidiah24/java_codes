package lab8;
import java.util.Scanner;

public class ArrayManips {
	private int[] arr1;   
	private int[] arr2;
	private int size;
	Scanner input = new Scanner(System.in);

	
	ArrayManips(int size) {
		this.size = size;
		arr1 = new int[size]; 
		arr2 = new int[size]; 
	}
	
	
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
		
	}
	
	public void printMenu() {
		System.out.println("There are a few options to choose from: ");
		System.out.println();
		System.out.println("(1) readInput() ");
		System.out.println("(2) reverseRow() ");
		System.out.println("(3) findRowPrimes() ");


	}
	
	
	public void readInput() {
		
		for (int i=0; i<getSize(); i++) {
			System.out.print("Enter the int: ");
			int a = input.nextInt();
			arr1[i] = a;
			arr2[i] = a;
			
				
			}
		System.out.println();
		System.out.print("[");
		for (int i=0 ; i<getSize(); i++) {
			
			System.out.print(" "+arr1[i]);
					
		}
		
		System.out.println("]");
		System.out.println();

	}
	public void reverseRow() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("which array to reverse 1 or 2: ");
		int decision = input.nextInt();
		
		int j = getSize() - 1;
		
		if (decision==1) {
			for (int i=0; i<getSize() /2 ; i++) {
				int temp = arr1[i];
				arr1[i] = arr1[j];
				arr1[j] = temp;
				j--;
				}
			System.out.print("[");
			for (int i=0 ; i<getSize(); i++) {
				
				System.out.print(" "+arr1[i]);
						
			}
			System.out.println("]");

				System.out.println();
		}
		else if (decision==2) {
			for (int i=0; i<getSize() /2 ; i++) {
				int temp = arr2[i];
				arr2[i] = arr2[j];
				arr2[j] = temp;
				j--;
				}
			System.out.print("[");
			for (int i=0 ; i<getSize(); i++) {
				
				System.out.print(" "+arr2[i]);
						
			}
			System.out.print("]");
			System.out.println();

		}
		else {
			System.out.println("wrong Input!!! ");
		}
		
		
		for (int i=0 ; i<getSize(); i++) {
			
		}
		
	}
	private boolean isPrime(int num) {
		  	boolean flag;
		    for (int i = 2; i <= num / 2; ++i) {
		      if (num % i == 0) {
		    	  return false;
		        
		      }
		      
		    }
		      return true;

	}
	
	
	public void findRowPrimes() {
		int count = 0;
		
		for(int i=0; i<getSize(); i++){
			if (isPrime(arr1[i])==true) {
				count++;
			}
	        }
		        
	     
		    System.out.println("there are "+count+ " prime numbers in the array.");
	    
	        }
	        
	        
	
}
