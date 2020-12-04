package com.list;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Author MAHMOUD IBRAHIM (cs.mahmoued@gmail.com)
 * */
public class ArrayListImplemt {

	public static void main(String[] args) {
	
		// create the ArrayList of Strings
		ArrayList<String> names =new ArrayList<>();
		
		//add elements in Array
		names.add("Jak");
		names.add("Laila");
		names.add("Mona");

		// display elements of array by Foreach  
		for(String n : names) {
			System.out.println(n);
		}
		
		// add another element it will add in the last index in array
		names.add("Luis");
		
		// display elements by Print 
		System.out.println(names);
		
		// remove element Mona in index [2]
		names.remove(2);
		
		//display elements
		System.out.println(names);
		
		// get a specific element 
		String n=names.get(1);
		System.out.println("the element in index 2 :"+n);
		
		//change element contenet
		names.set(1, "Laila2");
		
		// you can display elements by Iterator
		Iterator iterator=names.iterator(); 
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//you can also display element by for loop
		System.out.println("you can also display element by for loop:");
		int sizOfList=names.size();
		for (int i = 0; i < sizOfList; i++) {
			System.out.println(names.get(i));
		}
		
	}

}
