
/*
 * program-a Java program to find the second largest element in an array.
 * @author-Raja Kumar Gupta
 * @date-20 Oct 2022
 * 
 */
package CoreJava;

import java.util.Scanner;

public class SecondLargest {

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
	    //traversing the array
	    for(int i=0;i<size;i++) {
	    	for(int j=i+1;j<size;j++) {
	    		if(a[i]>a[j]) {
	    			int t=a[i];
	    			a[i]=a[j];
	    			a[j]=t;
	    			
	    		}
	    	}
	    	
	    }
	    //printing the second largest element
	    System.out.println("Second largest number is "+a[size-2]);
	 
	}

}
