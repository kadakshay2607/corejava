package com.te.listassignment;

import java.util.Comparator;

public class Student extends Decision implements Comparable<Student> {
	
	int id;
	String className;
	String name;
	int age;
	double marks;
	int k;
	
	public Student( int id, String className, String name, int age, double marks) {
		this.id = id;
		this.className = className;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	
	@Override
	public String toString() {
		return "id=" + id + ", className=" + className + ", name=" + name + ", age=" + age + ", marks=" + marks;
	}
	@Override
	public int compareTo(Student o) {
		return this.hashCode()-o.hashCode();
	}
	@Override
	public int hashCode() {
		return this.k;
	}
	public Student() {
		super();
	}
	public void dec1(int p) {
		int a = p;
		if (this.a == 1) {
          this.k = this.id;
          System.out.println("hi");
		}
		else if(this.a == 2) {
			
		}
		else if(this.a == 3) {

		}
		else if(this.a == 4) {
			 this.k = this.age;
		}
		else if(this.a == 5) {
			
		}
		else if(this.a == 6) {
         System.out.println("Exit from the Program.");
		}


	}
	

}
