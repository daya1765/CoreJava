//Program on unary operators
package CoreJava;

import java.util.Scanner;

 class UnaryOperator {

	public static void main(String[] args) {
		//Creating object of class Scanner to take user input
		Scanner sc=new Scanner(System.in);
		//taking int value from user
		System.out.println("Enter a number");
		int a=sc.nextInt();
		//performing operations using unary operators
		a=-a;
		System.out.println("Result is"+" "+a);
		//Post increment (unary operator)
		System.out.println("the vale of a++ is"+" "+(a++));
		//Pre increment (unary operator)
		System.out.println("the vale of ++a is"+" "+(++a));
		//Post decrement (unary operator)
		System.out.println("the vale of a-- is"+" " +(a--));
		//Pre decrement (unary operator)
		System.out.println("the vale of --a is"+" "+(--a));
		

	}

}
