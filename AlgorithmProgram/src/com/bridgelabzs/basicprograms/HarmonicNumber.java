package com.bridgelabzs.basicprograms;

import java.util.Scanner;

import com.bridgelabzs.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		System.out.println("Enter the value of n:");
		int n=Utility.integerInput();
		Utility.harmonicNumber(n);
	}
}
