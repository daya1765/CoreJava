/*Program-To check a year whether it is a leap year or not
@Author-Raja kumar Gupta
@date- 6th October 2022
*/
package CoreJava;

import java.util.Scanner;

class LeapYear {

	public static void main(String[] args) {
		//Creating object of class Scanner to take input from User
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter the year ");
	    //taking year as input 
	    int year=sc.nextInt();
	    if(year%400==0) {
	    	System.out.println("This is a leap year");
	    }
	    else if(year%100==0) {
	    	System.out.println("It is not a leap year");
	    }
	    else if(year%4==0) {
	    	System.out.println("It is a leap year");
	    }
	    else {
	    	System.out.println("It is not a leap year");
	    }

	}

}
