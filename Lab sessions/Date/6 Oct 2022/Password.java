/*Program-To check password validation
@Author-Raja kumar Gupta
@date- 6th October 2022
*/
package CoreJava;

import java.util.Scanner;

class Password {

	public static void main(String[] args) {
		//Creating object of class Scanner to take input from User
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter the password ");
	    String s=sc.nextLine();
	    
	    String Password="Ra@123";
	    //checking password validation
	    if(Password==s) {
	    	System.out.println("Password is correct");
	    }
	    else {
	    	System.out.println("Password is incorrect");
	    }

	}

}
