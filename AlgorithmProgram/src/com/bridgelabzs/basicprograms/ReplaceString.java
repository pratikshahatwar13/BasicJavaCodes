package com.bridgelabzs.basicprograms;

import com.bridgelabzs.utility.Utility;

public class ReplaceString {

	public static void main(String[] args) {
		String Input="Hello <<UserName>>, How are you?";
	
		System.out.println("The output after replacing UserName with Pratiksha");
	    
		Utility.replaceString(Input);
	}
}
