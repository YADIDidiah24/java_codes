package lab9;
import java.util.Scanner;

public class TwoDimArrayManips {
private int rowSize;
private int colSize;
private double[][] arr;

public TwoDimArrayManips(int row , int col) {
	rowSize = row;
	colSize = col;
	arr = new double[rowSize][colSize];
}

public void setRow(int r) {
	rowSize = r;
}
public int getRow() {
	return rowSize;
}

public void setCol(int c) {
	colSize = c;
}

public int getCol() {
	return colSize;
}

public void printMenu() {
	System.out.println("This program provides the following matrix manipulation services: ");
	System.out.println(" 1.	Populate the arrays (using a method 'readInput()' )");
	System.out.println(" 2.	Print the matrix in tabular form.(using a method 'printMatrix( )' ) ");
	System.out.println(" 3.	Print a specific row (using a method 'printRow()' )");
	System.out.println(" 4.	Print a specific column (using a method 'printCol()' )");
	System.out.println(" 5.	Get the elements of a specific row reversed (using a method reverseRow())");
	System.out.println(" 6.	Quit");
}

public void readInput() {
	Scanner input= new Scanner(System.in);
	System.out.println("Please enter "+ getCol() +" integers per row for "+getRow() +" rows.");
    System.out.println("Press spacebar after entering a number, enter after entering "+getCol()+" integers.");
    System.out.println();
    for (int i=0; i<rowSize; i++)
        for (int j=0; j<colSize; j++)
            arr[i][j]=input.nextDouble();
}
public void printMatrix( ) {
	System.out.println();
	for (int i = 0; i < rowSize; i++) {
        for (int j = 0; j < colSize; j++)
            System.out.print(arr[i][j] + "\t");
        System.out.println();
    
    }
	System.out.println();
}

public void printRow(int r) {
	System.out.println();
	System.out.println("the elements in row "+r+ " are : ");
	System.out.println();
	for(int i = 0; i < arr[r].length; i++) {
	    System.out.println(arr[r][i]+" ");

	}
	System.out.println();
}

public void printCol(int c) {
	System.out.println();
	System.out.println("the elements in col "+c+ " are : ");
	for(int i = 0; i < rowSize; i++) {
	    System.out.println(arr[i][c]+ " "); }
	System.out.println();
}
public void reverseRow(int r) {
	System.out.println();
	int j = arr[r].length-1;
	for (int i=0; i<arr[r].length /2 ; i++) {
		double temp = arr[r][i];
		arr[r][i] = arr[r][j];
		arr[r][j] = temp;
		j--;
		}
	System.out.println("the reversed row is: ");
	System.out.print("[");
	for (int i=0 ; i<arr[r].length; i++) {
		
		System.out.print(" "+arr[r][i]);
				
	}
	System.out.println("]");

		System.out.println();
}






}
