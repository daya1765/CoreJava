package CoreJava;

import java.util.Scanner;

class ArrayUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int a=sc.nextInt();
		//declaring array
		int arr[]=new int[a];
		System.out.println("Enter the elements ");
		//traversing the array 
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		//traversing the array to find sum 
		for(int i=0;i<a;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of all elements of the array is "+sum);
		
		
		

	}

}
