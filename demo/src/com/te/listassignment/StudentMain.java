package com.te.listassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentMain {
	static int n ;
	public static void dec() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("For id =1/className=2/ name=3/ age=4/ marks=5/ Exit=6");
		int no = scanner.nextInt();
		n = no;
	}
	public static void main(String[] args) {
		dec();
		Student.a = n;
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(2, "first", "abc", 6, 55));
		list.add(new Student(3, "third", "pqr", 8, 45));
		list.add(new Student(1, "fifth", "xyz", 9, 83));
		if (n != 6) {
			for (Student student : list) {
				System.out.println(student);
				System.out.println("...............");
				dec();
			}	
		}else {
			System.out.println("exit from the program");
		}


	}
}



