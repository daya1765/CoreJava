/*
 * program-To print a 2-D array by taking inputs from user
 */

package CoreJava;

import java.util.Scanner;

class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int m=sc.nextInt();//m indicates number of rows
		System.out.println("Enter the number of columns: ");
		int n=sc.nextInt();//n indicates number of columns
		int arr[][]=new int[m][n];//initializing a 2-D array
		//Taking inputs from user
		System.out.println("Enter the elements of the 2-D array: ");
		//Outer loop for number of rows 
		for(int i=0;i<m;i++) {
			//Inner loop for number of columns
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
				
			}
			
		}
		//Displaying 2-D array 
		System.out.println("The two dimensional array is: ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
