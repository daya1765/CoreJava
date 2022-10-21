/*
 * program-to print the reverse of a single string using built-in method
 */

package CoreJava;

import java.util.Scanner;

public class ArrayStringReverse {

	public static void main(String[] args) {
		//Creating object of Class Scanner to take input from user 
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter the string ");
	    //taking string as input from user
	    String arr=sc.nextLine();
	    //converting string into sequence of characters
	    char a[]=arr.toCharArray();
	    //printing string in reverse order
	    for(int i=a.length-1;i>=0;i--) {
	    	System.out.print(a[i]);
	    }
	}

}
