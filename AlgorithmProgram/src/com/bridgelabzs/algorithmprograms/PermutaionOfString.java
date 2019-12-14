package com.bridgelabzs.algorithmprograms;

public class PermutaionOfString {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the string");
		String word = utility.stringInput();
		char[] seq = word.toCharArray();
		utility.permute(seq,0);
	}
}
