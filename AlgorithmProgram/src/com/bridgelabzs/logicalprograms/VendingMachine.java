package com.bridgelabzs.logicalprograms;

import com.bridgelabzs.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) {
		System.out.println("Enter the value :");
		int value=Utility.integerInput();
		
		Utility.vendingMachine(value);

	}

}
