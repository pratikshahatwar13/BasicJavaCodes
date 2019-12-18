package com.bridgelabzs.datastructure;

public class UnOrderedList {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the number to be searched");
		String searchItem  = utility.stringInput();
		Utility.orderedList(searchItem);

	}

}
