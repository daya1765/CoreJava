/*
 Program-  to print Reverse of numbers for example 10 9 8 7 6 5 4 3 2 1 using do-while loop and take the input from the user.
 */

package CoreJava;

import java.util.Scanner;

public class ReverseTillOne {

	public static void main(String[] args) {
		//Creating object of class Scanner to take input from User
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter a number ");
	    int a=sc.nextInt();
	    int i=a;
	    do {
	    	System.out.println(i);
	    	--i;
	    }while(i>0);
	}

}