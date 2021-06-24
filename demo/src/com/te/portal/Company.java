package com.te.portal;

public class Company extends Register {
	
	public void apply() {
		if((ten>60)&&(diploma>60)&&(degree>60)) {
			System.out.println("Eligible for Drive");
		}
		
	}

}
