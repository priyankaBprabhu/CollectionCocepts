package com.bl.collection;

import java.util.TreeSet;

public class TreeSetAccessMethods {
	public static void main(String args[]) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
//		explicitly mentioned 
		System.out.println("Initial Set: " + set);

		System.out.println("Reverse Set: " + set.descendingSet());

		System.out.println("Head Set: " + set.headSet("C", true));

		System.out.println("SubSet: " + set.subSet("A", false, "E", true));

		System.out.println("TailSet: " + set.tailSet("C", false));
		
//		default taken by jvm

		System.out.println("Intial Set: " + set);

		System.out.println("Head Set: " + set.headSet("C"));// false

		System.out.println("SubSet: " + set.subSet("A", "E"));// true, false

		System.out.println("TailSet: " + set.tailSet("C"));// true
	}

}
