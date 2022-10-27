/*
 * program-To print integer array into ascending order using built-in method
 * @name-Raja Kumar Gupta
 * @date-27 Oct 2022
 */
package CoreJava;

import java.util.Arrays;
import java.util.Scanner;

class SortingIntArray {

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
	    Arrays.sort(a);
	    System.out.println("The integer array in ascending order is ");
	    for(int i=0;i<size;i++) {
	    	System.out.println(a[i]);
	    }
	}

}
