package com.bridgelabzs.logicalprograms;

import com.bridgelabzs.utility.Utility;

public class Gambler {

	public static void main(String[] args) {
		System.out.println("Enter the value of stake:");
		int stake=Utility.integerInput();
		System.out.println("Enter the value of goal");
		int goal=Utility.integerInput();
        System.out.println("Enter the number of trials:");
        int trials=Utility.integerInput();
        
        Utility.gambler(stake, goal, trials);
        
	}

}
