package com.bridgelabzs.functionalprogram;

import java.util.Scanner;

import com.bridgelabzs.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		System.out.println("Enter the value of x:");
		int x=Utility.integerInput();
		System.out.println("Enter the value of y:");
		int y=Utility.integerInput();
		Utility.distance(x, y);
	}
}
