/*
 * program-To create integer array of 10 elements, accepts values of arrays and Find sum of all odd numbers
 * @author-Raja Kumar Gupta.
 * @date-19 Oct 2022
 */

package CoreJava;

import java.util.Scanner;

class ArrayOdd {

	public static void main(String[] args) {
		//Creating object of Class Scanner to take input from user 
	    Scanner sc =new Scanner(System.in);
	    //declaring an array
	    int arr[]=new int[10];
	    System.out.println("Enter the numbers");
	    //taking input from the user
	    for(int i=0;i<10;i++) {
	    	arr[i]=sc.nextInt();
	    	
	    }
	    int sum=0;
	    //traversing the array
	    for(int i=0;i<10;i++) {
	    	if(arr[i]%2!=0) {
	    		sum+=arr[i];
	    	}
	    }
	    System.out.println("Sum of all odd numbers is "+sum);
	    
	    
		
	}

}
