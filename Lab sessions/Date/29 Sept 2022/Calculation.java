/*
Program :Create a program for calculation.read three values from the user for operation
         first and second values as operands.
         third value as operator.
         if user press1 => print addition of first and second
         if user press2 => print subtraction of first and second
         if user press3 => print multiplication of first and second
         if user press4 => print division of first and second
@author :Raja kumar Gupta
@date : 29 Sept 2022


*/
package CoreJava;

import java.util.Scanner;//Scanner is a class present in util sub-package of java package

class Calculation {

	public static void main(String[] args) {
		//Creating object of class Scanner to take user inputs
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		//Assigning the user value to variable a
		int a=sc.nextInt();
		System.out.println("Enter a number :");
		//Assigning the user value to variable b
		int b=sc.nextInt();
		System.out.println("Enter 1 for addition :\nEnter 2 for subtraction :\nEnter 3 for multiplication :\nEnter 4 for division :");
		//Assigning the user choice value to variable c
		int c=sc.nextInt();
		switch(c) {
		case 1:System.out.println("Addition is "+" "+(a+b));//Performing addition 
		break;
		case 2:System.out.println("Subtraction is "+" "+(a-b));//Performing subtraction 
		break;
		case 3:System.out.println("Multiplication is "+" "+(a*b));//Performing multiplication
		break;
		case 4:System.out.println("Division is "+" "+(a/b));//Performing division
		break;
		default:System.out.println("You have entered wrong input");//default case will execute when user inputs an integer other than 1, 2, 3 and 4
		
		}//end of switch
		

	}//end of main method

}//end of class Calculation
