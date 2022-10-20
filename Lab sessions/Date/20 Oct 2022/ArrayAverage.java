/*
 * Program-a Java program to calculate the average value of array elements.
 * @author-Raja kumar Gupta
 * @date-20 Oct 2022
 */

package CoreJava;

import java.util.Scanner;

class ArrayAverage {

	public static void main(String[] args) {
		//Creating object of Class Scanner to take input from user 
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter the size of the array ");
	    int size=sc.nextInt();
	    //declaring an array
	    int a[]=new int[size];
	    System.out.println("Enter the array elements");
	    //taking input from the user
	    for(int i=0;i<size;i++) {
	    	a[i]=sc.nextInt();
	    	
	    }
	    float sum=0;
	    float avg;
	    //traversing the array
	    for(int i=0;i<size;i++) {
	    	sum+=a[i];
	    }
	    avg=sum/size;
	    System.out.println("Average of the numbers is "+avg);
	    
		
	}

}
