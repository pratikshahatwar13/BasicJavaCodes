package com.bridgelabzs.algorithmprograms;

public class AnagramDetection {

	public static void main(String[] args) {
        System.out.println("Enter the string s1:");
        String str1=Utility.stringInput();
        System.out.println("Enter the string s2:");
        String str2=Utility.stringInput();
        Utility.anagramDetection(str1, str2);
	}
}
