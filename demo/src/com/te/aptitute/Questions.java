package com.te.aptitute;

import java.util.Scanner;

public class Questions {
	
	String [] str = new String[20];
	int [] a = new int [20];
	
	
	Scanner scanner = new Scanner(System.in);
	
	public void mcq() {
		int i = 1;
		for (int j = 0; j < str.length; j++) {
			str[j] = "Q."+i+"  What is correct option ?"
					+" option=1"
					+" option=2"
					+" option=3"
					+" option=4";
			i++;
		}
	}
	public void start() {
		for (int j = 0; j < str.length; j++) {
			System.out.println(str[j]);
			System.out.println("Enter your choice");
			int no = scanner.nextInt();
			if (no == 1) {
				a[j] = 1;
			}
			else if (no == 2) {
				a[j] = 0;
			}
			else if (no == 3) {
				a[j] = 0;
			}
			else if (no == 4) {
				a[j] = 1;
			}
		}
	}
	public void result() {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				count++;
			}
		}		
		int correct =  count;
		System.out.println("No of Correct Option is : " + count);
		int per = correct/a.length*100;
		System.out.println("Percentage for Test Is : " + per);
		if ((per >= 35) && (per <= 50)) {
			System.out.println("Performance is bad");	
		}
		else if ((per >= 51) && (per <= 65)) {
			System.out.println("Performance is good");
		}
		else if ((per>= 66) && (per <= 80)) {
			System.out.println("Performance is very good");
		}
		else if ((per >= 81) && (per <= 100)) {
			System.out.println("Performance is very Excellent");
		}
		System.out.println("....................................");
		 if (per >= 65) {
			System.out.println("eligible for next round");
		}
	}

}



