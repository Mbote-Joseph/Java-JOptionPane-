package Fundamentals;

import java.util.Arrays;
public class Main {

	 public static void main(String[] args) {
		    
		    double[] weights= {23.5,18.3,21.9,16.0,9.4,31.8,20.6};
		    
		    for(int i=0;i<weights.length;i++)
		    {
		      System.out.println(weights[i]);
		    }
		    
		    Arrays.sort(weights);
		    System.out.println("printing package weights after sorting");
		    
		    for(int i=0;i<weights.length;i++)
		    {
		      System.out.println(weights[i]);
		      
		    }
		   
		    
		    double sum=0;
		    double average=0;
		    for(int i=0;i<weights.length;i++)
		    {
		      sum = sum +weights[i];
		    }
		    
		    average = sum/(weights.length);
		    
		    System.out.println("The sum is: "+sum);
		    System.out.println("The average is: "+average);
		    System.out.println("The minimum is: "+weights[0]);
	 }
}
