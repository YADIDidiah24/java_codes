import java.util.Scanner;
import java.lang.Math; 
import java.text.DecimalFormat;
public class ComputeDev {
	
	private double [] arr;  
	private int size;  
	private double mean; 
	private double stdev;
	private static final DecimalFormat df = new DecimalFormat("0.00");
	ComputeDev(int N) {
		size = N;
		arr = new double[N];
	}
	

	public int getSize() {
        
        return size;

	}
	
	
	public double getMean() {
		
		return mean;
	}
	public void average() {
		this.size = getSize();
		double sum=0;
		for (int k = 0; k<size;k++) {
			sum += arr[k];
		}
		mean = sum/size;
	}
	
	public void  readInput(){
		Scanner input=new Scanner(System.in);
		
	    for (int i =0; i <getSize(); i++)
	    {
	        System.out.print("Enter the number: ");
	      this.arr[i] = input.nextDouble();

	    }
	    input.close();

	} 
	

	
	
		
	
	
	public double ComputeStDev() {
		
		double sum =0;
		average();
		for (int i=0; i<size;i++) {
		
			sum += Math.pow((arr[i]- getMean()),2);
		}
		stdev = Math.sqrt(sum/(size-1));
		
		return stdev;
	}
	
	
	public void writeOutput() {
		System.out.print("The contents of the array is: [");
		for (int i = 0;i<size;i++) {
			System.out.print(arr[i]+" ");

		}
		System.out.println("]");
		System.out.println("The standard deviation is: "+ df.format(stdev));

			   }
	
	
	
	
	
	

}
