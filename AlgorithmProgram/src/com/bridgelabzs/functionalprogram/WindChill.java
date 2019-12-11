package com.bridgelabzs.functionalprogram;

import com.bridgelabzs.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		System.out.println("Enter the value of temperature:");
        double t=Utility.doubleInput();
        System.out.println("Enter the value of speed:");
        double v=Utility.doubleInput();
        
        Utility.windChill(t, v);
	}
}
