/*
 * program-a Java program to sort a numeric array.
 * @author-Raja Kumar Gupta
 * @date-20 Oct 2022
 */

package CoreJava;

import java.util.Scanner;

class ArraySortingNumeric {

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
	    //Sorting the array
	    for(int i=0;i<size;i++) {
	    	for(int j=i+1;j<size;j++) {
	    		if(a[i]>a[j]) {
	    			int t=a[i];
	    			a[i]=a[j];
	    			a[j]=t;
	    			
	    		}
	    	}
	    	
	    }
	    //printing the sorted array
	    System.out.println("Sorted array is ");
	    for(int i=0;i<size;i++)	{
	    	System.out.println(a[i]);
	    	
	    }
	}

}
