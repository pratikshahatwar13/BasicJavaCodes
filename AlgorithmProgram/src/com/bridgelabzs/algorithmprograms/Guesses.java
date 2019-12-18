package com.bridgelabzs.algorithmprograms;

import java.util.Scanner;

public class Guesses {

	public static void find(int low,int up){
	    //Displaying the value
	    if(low==up){
	      System.out.println("Your number is : "+low);
	      System.out.println("Intermediary numbers is "+(low-1)+" and "+(low+1));
	      return;
	    }
	    //Finding middle value between range low and up
	    int mid=(low+up)/2;
	    int ch;
	    System.out.println("Press 1 : "+low+" - "+mid);
	    System.out.println("Press 2 : "+(mid+1)+" - "+up);
	    ch=new Utility().integerInput();
	    //Number is in first half
	    if(ch==1){
	      find(low,mid);
	    }
	    //Number is in second half
	    else{
	      find(mid+1,up);
	    }
		}
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the low value:");
		int low=scn.nextInt();
		System.out.println("Enter the heigh value:");
		int up=scn.nextInt();
		
		Guesses.find(low, up);
	}

}
