/*Program-To print reversePyramid
@Author-Raja kumar Gupta
@date- 6th October 2022
*/

package CoreJava;

import java.util.Scanner;

class ReversePyramid {

	public static void main(String[] args) {
		//Creating object of class Scanner to take input from User
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter the number of rows ");
	    int a=sc.nextInt();
	    int i,j;
	    //Outer loop for number of rows
	    for(i=a;i>=1;i--) {
	    	//inner loop for handling spaces
	    	for(j=i;j<a;j++) {
	    		System.out.print(" ");
	    	}
	    	//Inner loop for printing stars 
	    	for(j=1;j<=(2*i-1);j++) {
	    		System.out.print("*");
	    	}
	    	System.out.print("\n");//it will change the line
	    }

	}

}