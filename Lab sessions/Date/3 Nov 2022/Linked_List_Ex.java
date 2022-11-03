/*
 * program- a java program to check if a particular element exist in a Linked List
 * @name-Raja Kumar Gupta
 * @date-3 Nov 2022
 */
package collection;

import java.util.LinkedList;
import java.util.Scanner;

public class Linked_List_Ex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> l=new LinkedList<Integer>();
		System.out.println("How many elements do you want: ");
		int size=sc.nextInt();
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++) {
			l.add(sc.nextInt());
		}
		System.out.println("The elements of the LinkedList are: ");
		System.out.println(l);
		System.out.println("Which element you want to find: ");
		int num=sc.nextInt();
		int count=0;
		for(int i:l) {
			if(i==num) {
				System.out.println("It is present");
				count++;
				break;
			}
		    
		}
		if(count==0) {
			System.out.println("Not Present");
		}
	


	}

}
