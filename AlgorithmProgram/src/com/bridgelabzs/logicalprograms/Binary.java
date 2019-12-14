package com.bridgelabzs.logicalprograms;

import java.util.Scanner;

public class Binary {
    static int value;
	public static  void powerOf2(int value) {
		for(int i=0;i<10;i++)
		{
			double res=Math.pow(2,i);
			if(res==value)
			{
				System.out.println("The number is power of two");
			}
		}	
		System.out.println("The number is not power of two");
	}
	public static void swapNibbles(int x) {
		
		    value= ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
		    System.out.println("The new number after swaping:"+value);
	}
	public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			System.out.println("Enter a number x");
			int x=s.nextInt();	
			Binary.swapNibbles(x);
			Binary.powerOf2(value);
	}

}
