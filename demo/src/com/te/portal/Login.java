package com.te.portal;

import java.util.Scanner;

public class Login extends Register {

	public void login() throws InvalidEmailException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter valid email ");
		String emailid = scanner.nextLine();
		if(hashSet.contains(emailid)) {
		System.out.println("Login Successfully");
		System.out.println("  Name   10M   DipM  DegM" );
		System.out.println(arrayList);
		/*System.out.println("Press 1 For Apply Drive");
		int j = scanner.nextInt();
		if (j == 1) {
		Register register = new Login();
		Company company = new Company();
		company= (Company)register;
		company.apply();
		}*/
		}
		else {
			throw new InvalidEmailException("Please register! First");
		}
	}

}
