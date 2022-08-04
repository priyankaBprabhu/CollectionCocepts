package com.bl.collection;

import java.util.*;

public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
//		list adding string values
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		System.out.println(list);
//		by iterator interface
		System.out.println("Traversing list through  Iterator:");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Traversing list through List Iterator:");
//		 Here, element iterates in reverse order
		ListIterator<String> list1 = list.listIterator(list.size());
		while (list1.hasPrevious()) {
			String str = list1.previous();
			System.out.println(str);
		}

//		list adding integer elements only
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(21);
		list2.add(11);
		list2.add(51);
		list2.add(1);
//		Sorting the list
		Collections.sort(list2);
		System.out.println(list2);


//		for each loop iterator
		for (Integer number : list2) {
			System.out.println(number);
		}
	}

}
