package CoreJava;

import java.util.Scanner;

public class ArihmeticOperations {

	public static void main(String[] args) {
		//Creating object of Scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		//Taking input from user
		System.out.println("Enter the first number :");
		int a=sc.nextInt();
		System.out.println("Enter the second number :");
		int b=sc.nextInt();
		System.out.println("Enter the third number :");
		int c=sc.nextInt();
		//performing operations
		int add,sub,mul,div,mod;
		add=a+b+c;
		sub=a-b-c;
		mul=a*b*c;
		div=a/b/c;
		mod=a%b%c;
		//showing results on console
		System.out.println("Addition is "+ add);
		System.out.println("Subtraction is "+ sub);
		System.out.println("Multiplication is "+ mul);
		System.out.println("Division is "+ div);
		System.out.println("Modulo is "+ mod);
		
		}
}
