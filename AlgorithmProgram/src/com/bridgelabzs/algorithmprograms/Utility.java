package com.bridgelabzs.algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Utility {
 
	static Scanner scn=new Scanner(System.in);
	
    public static int integerInput() {
  	  return scn.nextInt();
    }
    public static double doubleInput() {
  	  return scn.nextDouble();
    }
    public static String stringInput() {
  	  return scn.nextLine();
    }
    public static long longInput() {
  	  return scn.nextLong();
    }
    
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

  	public static void insertionForString(){
  		String[] words= {"cat", "dog", "cat", "monkey"};
  		String temp;
  		for(int i = 1; i < words.length; i++){
  			for(int j = i; j > 0; j--){
  				if(words[j].compareTo(words[j-1]) < 0){
  					temp = words[j];
  					words[j] = words[j-1];
  					words[j-1] = temp;
  				}
  				else {
  					break;
  				}
  			}
  		}
  		
  		for(int i = 0; i < words.length; i++)
		{
			System.out.println(words[i]+" ");
		}
  	}

  	public static void bubbleSort()
  	{
  		int a[] = {36, 19, 29, 12, 5};
  		int temp;
  		for(int i = 0; i < a.length; i++)
  		{
  			int flag = 0;
  			for(int j = 0; j < a.length-1-i; j++)
  			{
  				if(a[j] > a[j+1])
  				{
  					temp = a[j];
  					a[j] = a[j+1];
  					a[j+1] = temp;
  					flag = 1;		
  				}
  			}
  			if(flag == 0) {
  				break;
  			}
  		} 
  		
  		for(int i = 0; i < a.length; i++) {
				System.out.println(a[i]+" ");
		}
  	}

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
	
   	public static void anagramDetection(String str1, String str2)
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
  	public static void isPrimeNumber(int number) {
  		int i;
  		System.out.println("The prime numbers between 0 to 1000 are:");
		for(i = 2; i <= 1000; i++)
		{
			int temp=0;
			for(int j=2; j < i / 2; j++)
			{
				if(i % j == 0)
				{
					temp++;
				}
			}
			System.out.println(i);
		}
	}
   
  	public static void primeAnagram(){
  		int[] num=new int[500];
  		int i,k=0;
  		System.out.println("The prime numbers between 0 to 1000 are:");
		for(i=2;i<1000;i++)
		{
			int temp=0;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					temp++;
				}
			}
			
			if(temp==0)
			{
				num[k]=i;
				k++;
			}
			
		}
		for(int j=0;j<num.length;j++)
		{
			System.out.print(num[j]+" ");
		}
	
	}
  	
  //(8)
  	public boolean inputBoolean() {
		try {
			return scn.nextBoolean();
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
  	public static int power(int exponent, int number) {
		int sum = 1;
		for (int j = 0; j < exponent; j++) {
			sum = sum * number;
		}
		return sum;
	}
  	public static void binarySearchOutputBound(int[] array) {
		int start = 0;
		Utility utility = new Utility();
		int end = array.length;
		int midp = (start + end) / 2;
		while (start < end) {
			if (start == end - 1)
				break;
			if (start != ((start + end) / 2) - 1 && ((start + end) / 2) != end - 1) {
				System.out.println("You are between " + (start) + " and " + (end - 1) + "\nEnter false for " + ""
						+ start + " to " + (((start + end) / 2) - 1) + "  " + "\nor true for " + (((start + end) / 2))
						+ " to " + (end - 1));
			} else
				System.out.println("false for " + start + " and true for " + (end - 1));
			boolean b = utility.inputBoolean();
			if (end - start == 1) {
				if (b) {
					midp = end;
				} else
					midp = start;
				break;
			}
			if (end - start == 2) {
				if (b) {
					midp = end - 1;
				} else
					midp = start;
				break;
			}
			midp = ((start + end) / 2);
			if (b == true) {
				start = midp;
			} else if (b == false) {
				end = midp;
			}
		}
		System.out.println("Your Number is : " + (array[midp]));
	}
}
