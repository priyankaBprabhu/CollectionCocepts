package com.bl.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
//	TreeSet class maintains ascending order.
	public static void main(String args[]) {
		TreeSet<String> al = new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		System.out.println("Traversing element through Iterator in acending order");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Traversing element through Iterator in descending order");
		Iterator itr1 = al.descendingIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
