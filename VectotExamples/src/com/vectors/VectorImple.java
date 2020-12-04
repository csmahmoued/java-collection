package com.vectors;

import java.util.Vector;

public class VectorImple {

	public static void main(String[] args) {
		//creat vector object
		Vector<Integer> v=new Vector<>();
			
		v.add(1);
		v.add(5);
		v.add(10);
		//display elements 
		System.out.println(v);
		
		//remove element
		v.remove(2);
		
		System.out.println(v);
	
	}
}
