package CoreJava;

import java.util.Scanner;

class Percentage {

	public static void main(String[] args) {
		//Creating object of class Scanner to take input from User
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter marks of subject MATHS :");
		//taking inputs from user 
		float a=sc.nextFloat();
		System.out.println("Enter marks of subject PHYSICS :");
		float b=sc.nextFloat();
		System.out.println("Enter marks of subject CHEMISTRY :");
		float c=sc.nextFloat();
		System.out.println("Enter marks of subject COMPUTER SCIENCE :");
		float d=sc.nextFloat();
		System.out.println("Enter marks of subject ENGLISH :");
		float e=sc.nextFloat();
		//Calculation of percentage
		float perc=(a+b+c+d+e)/5;
		System.out.println("Percentage of five subject marks is "+perc);
		//Checking conditions using if Statement
		if(d>=80) {
			System.out.println("Student is pass and got 1st division");
		}
		else if(d>=60) {
			System.out.println("Student is pass and got 2nd division");
		}
		else if(d>=33) {
			System.out.println("Student is pass and got 3rd division");
		}
		else {
			System.out.println("Student is fail...");
		}
		

	}

}
