package com.bridgelabzs.algorithmprograms;

public class PrimeAnagram {

	public static boolean isAnagram(int num1,int num2)
  	{
		int[] arr1=new int[10];
		int[] arr2=new int[10];
		while(num1!=0 && num2!=0)
		{
			arr1[num1%10]++;
			num1=num1/10;
			arr2[num2%10]++;
			num2=num2/10;
		}
		for(int i=0;i<9;i++)
		{
			if(arr1[i]==arr2[i])
			{
				return false;
			}
		}
		return true;
  		
  	}
	public static void main(String[] args) {
        Utility.primeAnagram();

		System.out.println("Enter number num1:");
		int num1=Utility.integerInput();
		System.out.println("Enter number num2:");
		int num2=Utility.integerInput();
		
	}

}
