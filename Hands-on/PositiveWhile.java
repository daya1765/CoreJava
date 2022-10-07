/* 
 Program-To demonstrate while loop continues 
until entered number is positive.Take the input from the user
 */


package CoreJava;

import java.util.Scanner;

class PositiveWhile {

	public static void main(String[] args) {
		//Creating object of class Scanner to take input from User
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter a number ");
	    int a=sc.nextInt();
	    //loop will continue until the entered number is positive
	    while(a>0) {
	    	System.out.println("Hello I am good ");
	    	a--;
	    }
	    
	}

}
