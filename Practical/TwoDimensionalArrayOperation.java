/*
 * program-Subtraction and multiplication of two 2-D arrays
 */

package CoreJava;

import java.util.Scanner;

class TwoDimensionalArrayOperation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int m=sc.nextInt();//m indicates number of rows
		System.out.println("Enter the number of columns: ");
		int n=sc.nextInt();//n indicates number of columns
		int arr[][]=new int[m][n];//initializing a 1st 2-D array
		int brr[][]=new int[m][n];//initializing a 2nd 2-D array
		int crr[][]=new int[m][n];//initializing a 3rd 2-D array for subtraction matrix
		int drr[][]=new int[m][n];//initializing a 4th 2-D array for product matrix
		
		System.out.println("Enter the elements of 1st 2-D array: ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println("Enter the elements of 2nd 2-D array: ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				brr[i][j]=sc.nextInt();
				
			}
			
		}
		//Performing subtraction of 1st and 2nd 2-D array
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				crr[i][j]=arr[i][j]-brr[i][j];
				
			}
			
		}
		
		//Performing multiplication of 1st and 2nd 2-D array
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				drr[i][j]=0;
				for(int k=0;k<m;k++) {
					drr[i][j]+=arr[i][k]*brr[k][j];	
				}
			
			}
			
		}
		
		System.out.println("The subtraction of both 2-D arrays is: ");
		//Displaying the resultant 2-D array
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(crr[i][j]+" ");
				
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("The multipication of both arrays: ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(drr[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		

	}

	

}
