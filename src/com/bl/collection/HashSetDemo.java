package com.bl.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
//	The initial default capacity of HashSet is 16, and the load factor is 0.75.
//	HashSet is the best approach for search operations.
//	elements are inserted on the basis of their hashcode.
	public static void main(String args[]) {
		
		HashSet<String> set = new HashSet();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
