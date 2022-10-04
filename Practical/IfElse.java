package CoreJava;

import java.util.Scanner;

class IfElse {

	public static void main(String[] args) {
		//Creating object of class Scanner to take input from User
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your age :");
		//taking input from user and assigning to variable a
		int a=sc.nextInt();
		//checking condition using if statement
		if(a>=18) {
			System.out.println("Eligible for voting...");
		}
		else {
			System.out.println("Not eliible for voting...");
		}

	}

}
