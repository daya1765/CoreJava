/* Priority Queue:
 * It is a type of Queue  wherein all the elements are ordered as per their ordering 
 * and each element is associated with a priority.
 */

package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

class Priority_Queue {

	public static void main(String[] args) {
		PriorityQueue<String> num=new PriorityQueue<String>();
		num.add("raja");
		num.add("tina");
		num.add("kunal");
		System.out.println(num);
		System.out.println("Priority Queue: ");
		//iterator() method is used when you have to traverse a data structure
		//hasNext() method - it evaluates as boolean value true or false
		//next() method - it returns the next element until hasNext() method returns true
		Iterator<String> itr=num.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
		
		
	}

}
