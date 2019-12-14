package com.bridgelabzs.algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Utility {
 
	static Scanner scn=new Scanner(System.in);
    public static int integerInput()
    {
  	  return scn.nextInt();
    }
    public static double doubleInput()
    {
  	  return scn.nextDouble();
    }
    public static String stringInput()
    {
  	  return scn.nextLine();
    }
    public static long longInput() {
  	  return scn.nextLong();
    }
    //(1)
    public void permute(char[] array,int k) {
    
    		if (k == array.length) {
    			for (int i = 0; i < array.length; i++) {
    				System.out.print(array[i]);
    			}
    			System.out.println();
    		} else {
    			for (int i = k; i < array.length; i++) {
    				char temp = array[k];
    				array[k] = array[i];
    				array[i] = temp;
    				permute(array, k + 1);
    				temp = array[k];
    				array[k] = array[i];
    				array[i] = temp;
    			}
    		}
    	}
      //(2)
  //Insertation sort for String
  	public static void insertionForString(){
  		String[] words= {"cat","dog","cat","monkey"};
  		String temp;
  		for(int i=1;i<words.length;i++){
  			for(int j=i;j>0;j--){
  				if(words[j].compareTo(words[j-1])<0){
  					temp=words[j];
  					words[j]=words[j-1];
  					words[j-1]=temp;
  				}
  				else
  					break;
  			}
  			
  		}	
  		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]+" ");
		}
  	}
  	//(3)
  	public static void bubbleSort()
  	{
  		int a[]= {36,19,29,12,5};
  		int temp;
  		for(int i=0;i<a.length;i++)
  		{
  			int flag=0;
  			for(int j=0;j<a.length-1-i;j++)
  			{
  				if(a[j]>a[j+1])
  				{
  					temp=a[j];
  					a[j]=a[j+1];
  					a[j+1]=temp;
  					flag=1;		
  				}
  				System.out.println();
  			}
  			if(flag==0)
  			{
  				break;
  			}
  		}
  		for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]+" ");
			}
  	}
  	//(4)
  	public void merge(int arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public void mergeSort(int arr[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	//(5)
  	public static void anagramDetection(String str1,String str2)
  	{
  		boolean status=true;
  		if(str1.length()!=str2.length())
  		{
  			status=false;
  		}
  		else
  		{
  			char[] Arrays1=str1.toLowerCase().toCharArray();
  			char[] Arrays2=str2.toLowerCase().toCharArray();
            Arrays.sort(Arrays1);
            Arrays.sort(Arrays2);
            status=Arrays.equals(Arrays1,Arrays2);
  		}
  		if(status)
  		{
  			System.out.println(str1+" "+"and"+" "+str2+" "+"are anagrams");
  		}
  		else
  		{
  			System.out.println(str1+" "+"and"+" "+str2+" "+"are not anagrams");
  		}
  	}
  	//(6)
  	public static void isPrimeNumber1(int number) {
  		int i;
  		System.out.println("The prime numbers between 0 to 1000 are:");
		for(i=2;i<=1000;i++)
		{
			int temp=0;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					temp++;
				}
			}
			System.out.println(i);
		}
	}
    //(7)
  	public boolean isPrimeNumber(int number) {
		int count = 0;
		for (int j = 2; j <= number / 2; j++) {
			if (number % j == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			return true;
		} else
			return false;
	}
  	public static boolean isPalindrome(int number) {
		int sum = 0, r;
		int numberCopy = number;
		while (number > 0) {
			r = number % 10;
			sum = sum * 10 + r;
			number = number / 10;
		}
		if (numberCopy == sum)
			return true;
		else
			return false;
	}
}
