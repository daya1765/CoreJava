/*
 * program-a java program to change PriorityQueue to maximum Priority queue Using Any loop
 * @name-Raja Kumar Gupta
 * @date-3 Nov 2022
 */


package collection;

import java.util.Collections;
import java.util.PriorityQueue;

class Priority_Queue_Ex {

	public static void main(String[] args) {
		// Creating an object of PriorityQueue class
				PriorityQueue<Integer> object = new PriorityQueue<>(Collections.reverseOrder());
			      
				   // Add numbers in the Queue
				object.add(1000);
				object.add(220);
				object.add(301);
				object.add(202);
				object.add(163);
				object.add(7);
				object.add(12);
				object.add(59);
				object.add(84);
				
					//Printing Original priority queue
				   System.out.println("Original Priority Queue: "+object);
				   
				   //Printing Maximum priority Queue
				System.out.print("Maximum Priority Queue: ");
				Integer val = 10;
				//using while loop
				while( ( val = object.poll()) != null) {
				    System.out.print(val+"  ");
				      }
					  System.out.print("\n");
		

	}

}
