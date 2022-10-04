package CoreJava;

import java.util.Scanner;

class BitwiseOperator {
	public static void main(String[] args) {
		//Creating object of class Scanner to take input from User
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number :");
		//taking input from user and assigning to variable a
		int a=sc.nextInt();
		System.out.println("Enter a number :");
		//taking input from user and assigning to variable a
		int b=sc.nextInt();
		//performing bitwise operations on the vale of a an b
		System.out.println("a & b is "+" "+(a&b));//bitwise and
		System.out.println("a | b is "+" "+(a|b));//bitwise or
		System.out.println("a ^ b is "+" "+(a^b));//nitwise XOR
		System.out.println("~a is "+" "+(~a));//bitwise not
		System.out.println("bitwise not of (a & b) is "+" "+(~(a&b)));
		
	}

}
