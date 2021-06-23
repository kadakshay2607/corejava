package com.te.collection;

import java.util.Comparator;

public class EmployeeA implements Comparator<EmployeeA> {
 int id ;
 int marks;
 
	public static void main(String[] args) {
		Comparator<EmployeeA> comparator = new Comparator<EmployeeA>() {
		};

	}

	@Override
	public int compare(EmployeeA o1, EmployeeA o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
