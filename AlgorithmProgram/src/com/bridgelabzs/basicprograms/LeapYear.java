package com.bridgelabzs.basicprograms;

import java.util.Scanner;

import com.bridgelabzs.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the year :");
		int year=Utility.integerInput();
		Utility.leapYear(year);
		/*
		boolean leap=false;
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				//year is divisible by 400,hence the year is a leap year
				if(year%400==0)
					leap=true;
				else
					leap=false;
			}
			else
			    leap=true;
		}
		else
			leap=false;
			*/	
	}

}
