/*
 * program-a java program to compare two sets and retain elements which are same on both sets.(Using retainAll method)
 * @name-Raja Kumar Gupta
 * @date-3 Nov 2022
 */


package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set_Ex {

	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements do you want: ");
		int size=sc.nextInt();
		System.out.println("Enter the elements of the first set: ");
		for(int i=0;i<size;i++) {
			s1.add(sc.nextInt());
		}
		System.out.println("The first set elements are: ");
		System.out.println(s1);
		
		Set<Integer> s2=new HashSet<Integer>();
		System.out.println("Enter the elements of the second set: ");
		for(int i=0;i<size;i++) {
			s2.add(sc.nextInt());
		}
		
		System.out.println("The second set elements are: ");
		System.out.println(s2);
		s1.retainAll(s2);
		System.out.println("The elements which are same in both sets are: ");
		for(int i:s1) {
			System.out.println(i);
		}
		
		
		

	}

}
