package com.bridgelabzs.logicalprograms;

import com.bridgelabzs.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Enter temperature in fahrenheit:");
		double fahrenheit=Utility.doubleInput();
		Utility.temperatureConversion(fahrenheit);
	}

}
