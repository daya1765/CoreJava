package CoreJava;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		//creating object of class Scanner to take user inputs
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first number ");
		//taking int value from user
		int a=sc.nextInt();
		System.out.println("Enter the second number ");
		int b=sc.nextInt();
		System.out.println("Enter the third number ");
		int c=sc.nextInt();
		
		//performing and operation on two constraints
		System.out.println("And operation ->");
		System.out.println();
		if((a<b)&&(b==c)) {
			int sum=a+b+c;
			System.out.println("Sum is "+sum);
		}
		else {
			System.out.println("Condition is false");
		}
		
		
		//performing or operations on two constraints
		System.out.println("Or operation ->");
		System.out.println();
		if((a<b)||(b==c)) {
			int sum=a+b+c;
			System.out.println("Sum is "+sum);
		}
		else {
			System.out.println("Condition is false");
		}
		
		//not operator
		System.out.println("Performing not operator ->");
		System.out.println();
		System.out.println("!(a>b)-> "+!(a>b));
		System.out.println("!(a<b)-> "+!(a<b));
		
		
	}
}
