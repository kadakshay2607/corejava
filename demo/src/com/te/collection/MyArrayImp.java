package com.te.collection;

import java.util.Iterator;

public class MyArrayImp {

	public static void main(String[] args) {
		MyArray myArray = new MyArray(5);
		myArray.add("sam");
		myArray.add(12);
		myArray.add('s');

		for(int i=0;i<myArray.size();i++) {
			System.out.println(myArray.get(i));
		}
		System.out.println("..........................");
		Iterator iterator = myArray.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}

	}
}

