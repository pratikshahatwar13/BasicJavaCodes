package com.bridgelabzs.basicprograms;
import java.util.Scanner;

import com.bridgelabzs.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		System.out.println("Enter the value of chance:");
        int chance=Utility.integerInput();
        Utility.flipCoin(chance);
	}
}
