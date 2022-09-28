//Program on Assignment Operator
package CoreJava;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		//Creating object of class Scanner to take user inputs
		Scanner sc=new Scanner(System.in);
		//taking int value from user
		System.out.println("Enter the first number ");
		int a=sc.nextInt();
		System.out.println("Enter the second number ");
		int b=sc.nextInt();;
		//performing operations on assignment operator
		
		//Assignment operation with Addition
		a+=b;
		System.out.println("a="+a);
		
		//Assignment operation with Subtraction
		a-=b;
		System.out.println("a="+a);
		
		//Assignment operation with Multiplication
		a*=b;
		System.out.println("a="+a);
		
		//Assignment operation with Division
		a/=b;
		System.out.println("a="+a);
		
		//Assignment operation with modulus
		a%=b;
		System.out.println("a="+a);
		
	}

}
