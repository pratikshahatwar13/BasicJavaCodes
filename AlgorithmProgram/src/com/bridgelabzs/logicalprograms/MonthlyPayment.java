package com.bridgelabzs.logicalprograms;

import com.bridgelabzs.utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) {
		System.out.println("Enter the years:");
		double y=Utility.doubleInput();
		System.out.println("Enter the principal loan amount:");
		double  p=Utility.doubleInput();
		System.out.println("Enter the percent interest:");
		double r=Utility.doubleInput();
		
		Utility.monthlyPayment(y, p, r);

	}

}
