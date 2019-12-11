package com.bridgelabzs.functionalprogram;

import com.bridgelabzs.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
         System.out.println("Enter the value of a:");
         double a=Utility.doubleInput();
         System.out.println("Enter the value of b:");
         double  b=Utility.doubleInput();
         System.out.println("Enter the value of c:");
         double c=Utility.doubleInput();
         
         Utility.quadratic(a, b, c);
	}

}
