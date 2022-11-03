/*
 * program-a java program to replace the second element of a ArrayList with the specified element
 * @name-Raja Kumar Gupta
 * @date-3 Nov 2022
 */

package collection;

import java.util.ArrayList;
import java.util.Scanner;

class ArrayList_Replace {

	public static void main(String[] args) {
		ArrayList<Integer>  ar=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the arrayList: ");
		int size=sc.nextInt();
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++) {
			ar.add(sc.nextInt());
		}
		System.out.println("The ArrayList  with inserted elements are: ");
		System.out.println(ar);
		System.out.println("Enter the element by which you want to replace: ");
		int num=sc.nextInt();
		ar.set(1,num);//this method will replace the element at second position with the user specified element
	    System.out.println("The new ArrayList is: ");
        System.out.println(ar);		
		

	}

}
