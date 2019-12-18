package com.bridgelabzs.utility;


import java.util.Random;
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
      
      public static void replaceString(String Input)
      {
    	
		String Output=Input.replaceAll("UserName", "Pratiksha");
		System.out.println(Output);
      }
     
      public static void flipCoin(int chance)
      {
    	  int n;
    		float h,t,head = 0,tail=0;
    			System.out.println("Enter the number of time to flip:");
    			Random random=new Random();
    		
    			for(int i=1;i<chance;i++)
    			{
    				float num=random.nextFloat();
    				System.out.println(num);
    				if(num>0.5)
    				{
    					head++;
    					System.out.println("hed"+head);
    				}
    				else
    				{
    					tail++;
    					System.out.println("tail"+tail);
    				}
    			}
    			h=(head/chance)*100;
    			t=(tail/chance)*100;
    			System.out.println("Percentage of head are:"+h);
    			System.out.println("Percentage of tail are:"+t);

      }
      
      public static void leapYear(int year)
      {
    	  if((year%4==0 && year%100!=0) || year%400==0)
  			System.out.println(year+" "+"is a leap year");
  		else 
  			System.out.println(year+" "+"is not a leap year");
      }
      
      public static void powerOfTwo(int n)
      {
    	  for(int i=0;i<=n;i++)
          {
          	double res=Math.pow(2, i);
          	System.out.println("The power of two is:"+res);
          }
      }
      
      public static void harmonicNumber(int n)
      {
    	  double H=0;
  		
  		for(int i=1;i<=n;i++)
  		{
  			System.out.print("1/"+i+"+");
  			H=H+(double)1/i;
  		}
  		System.out.println();
  		System.out.println("The Harmonic number series addition is:"+H);
      }
      
      public static void primeFactorization(int n)
      {
    	int count=0;
  		for(int i=2;i<=n;i++)
  		{
  				while(n%i==0) 
  				{
  					System.out.println(i+" ");
  				n=n/i;
  				}
  		}
      }
      
      public static void twoDimensionalArray(int rows,int column)
      {
    	  //String elements in matrix
    	  int[][] arr=new int[rows][column];
    	  System.out.println("Enter elements in array:");
    	for(int i=0;i<rows;i++)
  		{
  			for(int j=0;j<column;j++) 
  			{
  				arr[i][j]=Utility.integerInput();
  			}
  		}
        //printing matrix in rows and column
    	//PrintWriter pw=new PrintWriter(System.out);
  		for(int i=0;i<rows;i++)
  		{
  			for(int j=0;j<column;j++) 
  			{
  			      //pw.print(arr[i][j]+" ");
  			    System.out.print(arr[i][j]+" ");
  			}
  			//pw.println();
  	        System.out.println();
  		}
      }
      
      public static void threeNumbersAddToZero()
      {
    	  
    	  
    	  int[] arr= {2,-2,7,5,-7,-5,0};
			int count=0;
	        for(int i=0;i<arr.length-2;i++)
	        {
	        	for(int j=1;j<arr.length-1;j++)
	        	{
	        		for(int k=2;k<arr.length;k++)
	        		{
	        			
	        			if(arr[i]+arr[j]+arr[k]==0)
	        			{
	        				System.out.println(arr[i] + " "+arr[j]+" "+arr[k]);
	        				count++;
	        				System.out.println();
	        			}
	        		}
	        	}
	        }
	        System.out.println("The total count of the numbers are:"+count);
		}
      
      public static void distance(int x,int y)
      {
    	double distance;
  		distance = Math.sqrt(x*x + y*y);
  		System.out.println("The Euclidean distance from the point (x, y) to the origin (0, 0) is:"+distance);
      }
      
      public static void quadratic(double a,double b,double c)
      {
    	  double root1,root2;
    	  double delta = b * b - 4 * a * c;
     
    	  double sqrt = Math.sqrt(delta);

          if(delta>0){
             root1 = (-b + sqrt)/(2*a);
             root2 = (-b - sqrt)/(2*a);
             System.out.println("Roots are :: "+ root1 +" and "+root2);
          }
          else if(delta == 0){
             System.out.println("Root is :: "+(-b + sqrt)/(2*a));
          }
      }
      
      public static void windChill(double t,double v)
      {
    	  double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
          System.out.println("Temperature in Fahrenheit= " + t);
          System.out.println("Wind speed in miles per hour = " + v);
          System.out.println("Wind chill  = " + w);
      }
      
      public static void gambler(int stake,int goal,int trials)
      {
    	  int bets = 0;        
          int wins = 0;        

          // repeat trials times
          for (int t = 0; t < trials; t++) {

              // do one gambler's ruin simulation
              int cash = stake;
              while (cash > 0 && cash < goal)
              {
                  bets++;
                  if (Math.random() < 0.5) 
                	  cash++;     // win $1
                  
                  else   
                	  cash--;     // lose $1
              }
              if (cash == goal) 
            	  wins++;             
          }

          // print results
          System.out.println(wins + " wins out of " + trials);
          System.out.println("Percent of games won = " + 100.0 * wins / trials);
          System.out.println("Avg # bets           = " + 1.0 * bets / trials);
      }
      
      public static void couponNumber()
      {
    	char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
  		int max=100000000;
  		int random=(int) (Math.random()*max);	
  		StringBuffer sb=new StringBuffer();
  		
  		while (random>0)
  		{
  			sb.append(chars[random % chars.length]);
  			random =random/ chars.length;
  		}

  		String couponCode=sb.toString();
  		System.out.println("Coupon Code: "+couponCode);	
      }
      
      public static void stopWatch() throws InterruptedException
      {
    	 double startTime;
  		 double stopTime;
  		
         startTime=System.currentTimeMillis();
         Thread.sleep(2000);
         int add=10+50;
         stopTime=System.currentTimeMillis();
         double elapsedTime=(stopTime-startTime);
         System.out.println("Elapsed time is:"+elapsedTime);
      }
      
       static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };
       static int i;
       static int total;
      public static void vendingMachine(int value)
      {
    	  if (value / notes[i] != 0) {
  			total+= (value / notes[i]);
  			System.out.println(notes[i] + "rs notes :" + value / notes[i]);
  			value = value % notes[i];
  		}
  		i++;
  		if (value == 0) {
  			System.out.println("total notes :" + total);
  			return;
  		}
        vendingMachine(value);
      }
      
      public static void dayOfWeek(int day,int month,int year)
      {
    	  int y0=(int) (year- Math.floor((14-month)/12));
    	  int x=(int) (y0+Math.floor((y0/4))-Math.floor((y0/100))+Math.floor((y0/400)));
    	  if(month<=12)
    	  {
    		  //calculating month of year using formunla 
    		  int m0=(int) (month+12*Math.floor((14-month)/12)-2);
    		  int d0=(int) ((day+x+Math.floor((31*m0)/12))%7);
    		  
    		  String[] arr= {"Sunday","Monday","Tuesday","wedensday","Thusday","Friday","Saturday"};
    		  //check condition num is greater than
    		  if(d0>0)
    		  {
    			  System.out.println("Day falls on:"+arr[d0]);
    		  }
    		  else
    		  {
    			  System.out.println("Invalid value:");
    		  }
    	  }
    	  else
    	  {
    		  System.out.println("Invalid month");
    	  }
      }
      
      public static void temperatureConversion(double fahrenheit)
      {
    	  double ctf=  (fahrenheit *9/5) + 32 ;
    	  double ftc= (fahrenheit-32) *5/9;
          System.out.println("temperature in Fahrenheit to Celsius is:"+ftc);
          System.out.println("temperature in Celsius to Fahrenheit is:"+ctf);
      }
      
      public static void monthlyPayment(double y,double p,double r)
      {
    	double n = 12 * y;
  		double r0 = r / (12 * 100);
  		double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
  		System.out.println("The monthly payments:"+payment);
      }
      
      public static void sqrt(double c)
      {
    	double t = c;
  		double epsilon = 1e-15;
  		while (Math.abs(t - c / t) > epsilon * t) 
  		{
  			t = (c / t + t) / 2;
        }
			System.out.println("The square root of nonnegative number is:"+t);
      }
      
      public static void toBinary(int dec)
      {
    	  int[] arr=new int[32];
    	  int i=0;
    	  while(dec>0)
    	  {
    		  arr[i]=dec%2;
    		  dec=dec/2;
    		  i++;
    	  }
    	  System.out.println("Conversion of decimal number into the binary:");
    	  for(int j=i-1;j>=0;j--)
    	  {
    		  System.out.print(arr[j]+" ");
    	  }
      }
}
