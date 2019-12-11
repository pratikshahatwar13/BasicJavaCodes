package com.bridgelabzs.logicalprograms;

import com.bridgelabzs.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		System.out.println("Enter date,month and year");
		int day=Utility.integerInput();
		int month=Utility.integerInput();
		int year=Utility.integerInput();

		Utility.dayOfWeek(day, month, year);
	}

}
