package com.bridgelabzs.algorithmprograms;

public class FindYourName {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the number");
		int number = utility.integerInput();
		int numberPower = Utility.power(number, 2);
		int[] array = new int[numberPower];
		for(int i=0;i<numberPower;i++) {
			array[i]=i;
		}
		Utility.binarySearchOutputBound(array);

	}

}
