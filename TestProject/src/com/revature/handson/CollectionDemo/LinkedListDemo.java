package com.revature.handson.CollectionDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> intList = new LinkedList<>();
		
		//Instantiate + add
		intList.add(new Integer(5));
		
		//Instantiate and add
		Integer myInt = new Integer(10);
		intList.add(myInt);
		
		//Instantiate with auto boxing
		Integer anotherInt = 8;
		intList.add(anotherInt);
		
		System.out.println("Printing toString()");
		System.out.println(intList);
		
		for(int i = 0; i < intList.size(); i++) {
			System.out.println("The element at potition "+i+" is: " + intList.get(i));
		}
		
		Iterator<Integer> iterator = intList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
