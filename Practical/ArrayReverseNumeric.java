/*
 * program-to print the array elements in reverse order
 */
package CoreJava;

import java.util.Scanner;

class ArrayReverseNumeric {

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
	    System.out.println();
	    System.out.println("Array elements in reverse order is");
	    //printing the elements in reverse order 
	    
	    for(int i=size-1;i>=0;i--) {
	    	System.out.println(a[i]);
	    }
		
		
		

	}

}
