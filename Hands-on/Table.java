/*
 Program-To print table of any number using for loop and take the input from the user.
 */

package CoreJava;

import java.util.Scanner;

class Table {

	public static void main(String[] args) {
		//Creating object of class Scanner to take input from User
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter a number ");
	    int a=sc.nextInt();
	    for(int i=1;i<=10;i++) {
	    	//Printing table of the number 
	    	System.out.println(a+"*"+i+"="+ a*i);
	    }
	}
}
