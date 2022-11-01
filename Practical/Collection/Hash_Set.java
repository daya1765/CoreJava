/*
 * HashSet:
 * It stores the element by using a mechanism called hashing
 * it contains only unique elements only.
 * It allows null values.
 * It does not maintain the insertion order. Here elements are inserted on the basis of their hashcode
 * 
 */

package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	public static void main(String[] args) {
		HashSet<String> str=new HashSet<String>();
		str.add("Kat");
		str.add("Mina");
		str.add("Tina");
		str.add("Sara");
		for(String s:str) {
			System.out.println(s);
		}
		System.out.println();
		Iterator<String> itr=str.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
