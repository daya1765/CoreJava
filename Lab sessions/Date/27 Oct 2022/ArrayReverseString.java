/*
 * program-To print the reverse of a string using built-in class
 * @name-Raja Kumar Gupta
 * @date-27 Oct 2022
 */

package CoreJava;

import java.util.Scanner;

public class ArrayReverseString {

	public static void main(String[] args) {
		//Creating object of Class Scanner to take input from user 
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter the string ");
	    //taking string as input from user
	    String arr=sc.nextLine();
	    StringBuilder sb=new StringBuilder(arr);
	    System.out.println(sb.reverse());
	    
	    //converting string into sequence of characters
	    //char a[]=arr.toCharArray();
	    //Arrays.sort(Collections.reverseOrder(a));
	    //System.out.print(Arrays.toString(a));
	    
		
	}

}
