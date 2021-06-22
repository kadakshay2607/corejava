package com.te.collection;

import java.util.Iterator;

public class MyArray implements Iterable{

	private Object [] array;
	private int position;

	public MyArray(int arraysize) {
		array = new Object[arraysize];
	}
	public Object get (int index) {
		return array[index];
	}
	public int size() {
		return position;
	}
	private void increaseCapacity() {
		Object [] temp = new Object[array.length];
		System.arraycopy(array, 0, temp, 0, array.length-1);
		array = temp;
	}
	public void add(Object e) {
		if (position >= array.length-1) {
			increaseCapacity();
		}
       array[position] = e;
       position++;
	}
	
    private class MyItr implements Iterator{
       int index;
		@Override
		public boolean hasNext() {
			
			return index<position ? true:false;
		}

		@Override
		public Object next() {
			Object object = array[index];
			index++;
			return object;
		}
    }
	public Iterator iterator() {
		
		return new MyItr();
	}

    }





