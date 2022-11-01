/* Deque: 
 * It is  a way to apply resizeable-array 
 * in addition to the implementation of the Deque interface.
 */

package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Array_Dequeue {

	public static void main(String[] args) {
		Deque<String>  num=new ArrayDeque<String>();
		num.add("raja");
		num.add("mango");
		num.add("apple");
		System.out.println(num);
		for(String i:num) {
			System.out.println(i);
		}
		num.pollLast();//returns the last element
		System.out.println("After PollLast: ");
		for(String s:num) {
			System.out.println(s);
		}
		

	}

}
