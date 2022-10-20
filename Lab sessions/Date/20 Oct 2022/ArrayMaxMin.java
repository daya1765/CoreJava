/*
 * Program-a Java program to find the maximum and minimum value of an array.
 * @author-Raja kumar Gupta
 * @date-20 Oct 2022
 */

package CoreJava;

import java.util.Scanner;

class ArrayMaxMin {

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
	    int max=a[0];
	    int min=a[0];
	    //traversing the array
	    for(int i=0;i<size;i++) {
	    	if(max<a[i]) {
	    		max=a[i];
	    	}
	    	if(min>a[i]) {
	    		min=a[i];
	    	}
	    		
	    }
	    System.out.println("Maximum value is "+max);
	    System.out.println("Minimum value is "+min);
	    

	}

}
