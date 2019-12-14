package com.bridgelabzs.logicalprograms;

import com.bridgelabzs.utility.Utility;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Enter the number in decimal:");
		int dec=Utility.integerInput();
        
		Utility.toBinary(dec);
	}

}
