/*
 *linked list implements the collection interface and it also stores duplicate data 
 */
package collection;

import java.util.Iterator;
import java.util.LinkedList;

class LinkedList_Ex {

	public static void main(String[] args) {
		LinkedList<Integer> ob=new LinkedList<Integer>();//creating linkedlist
		//adding object in linkedlist
		ob.add(55);
		ob.add(2);
		ob.add(58);
		//System.out.println(ob);
		Iterator a=ob.iterator();
		while(a.hasNext())
		{
			System.out.println(a.next());
		}
		

	}

}
