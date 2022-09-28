package CoreJava;

import java.util.Scanner;

public class RelationalOperators {

	public static void main(String[] args) {
		//Creating object of class Scanner to take user input
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first number ");
		float a=sc.nextFloat();
		System.out.println("Enter the second number ");
		float b=sc.nextFloat();
		//performing operations and showing results on console
		System.out.println("a>b :"+ (a>b));//greater than operator
		System.out.println("a<b :"+  (a<b));//less than operator
		System.out.println("a>=b :"+ (a>=b));//greater than or equal to operator
		System.out.println("a<=b :"+ (a<=b));//less than or equal to
		System.out.println("a!=b :"+ (a!=b));//not equal to operator
		System.out.println("a==b :"+ (a==b));//double equal to operator
		
		
		
		

	}

}
