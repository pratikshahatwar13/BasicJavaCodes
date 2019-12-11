package com.bridgelabzs.functionalprogram;

import java.util.Scanner;

import com.bridgelabzs.utility.Utility;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		System.out.println("Enter the value of rows:");
		int rows=Utility.integerInput();
		System.out.println("Enter the value of column:");
		int column=Utility.integerInput();
  		Utility.twoDimensionalArray(rows, column);
      }
		
	}
