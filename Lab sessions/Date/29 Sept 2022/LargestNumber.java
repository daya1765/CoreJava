/*
 Program :Create a program to find largest of two numbers
 @author :Raja Kumar Gupta
 @date : 29 Sept 2022 

*/

package CoreJava;

import java.util.Scanner;

class LargestNumber {
	public static void main(String[] args) {
		//Creating object of class Scanner to take user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		//Assigning the user value into variabe a
		int a=sc.nextInt();
		System.out.println("Enter a number :");
		//Assigning the user value into variabe b
		int b=sc.nextInt();
		//conditional operator
		if(a>b) {
			System.out.println("Largest number is "+ " "+a);
		}
		else {
			System.out.println("Largest number is "+" "+b);
		}
	}//end of main method

}//end of class LargestNumber
