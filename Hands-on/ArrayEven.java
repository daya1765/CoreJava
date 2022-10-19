/*
 * Program-To create integer array of 10 elements, accepts values of arrays and print  all even  numbers.
 * @author-Raja Kumar Gupta
 * @date-19 Oct 2022
 */

package CoreJava;

import java.util.Scanner;

class ArrayEven {

	public static void main(String[] args) {
		//Creating object of Class Scanner to take input from user 
		Scanner sc =new Scanner(System.in);
		//declaring an array
		int a[]=new int[10];
		System.out.println("Enter the numbers ");
		for(int i=0;i<10;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("Even numbers are ");
		//traversing the array
		for(int i=0;i<10;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		

	}

}
