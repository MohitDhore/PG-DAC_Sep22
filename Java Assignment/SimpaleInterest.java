/*
04.	Write a program to find the simple interest. Take the principle amount, 
rate of interest and time from user using Scanner class.*/

import java.util.*;
 
 class SimpaleInterest{
	 public static void main(String args[])
	 {
		 Scanner sc = new Scanner(System.in);
         
		 double si;
		 
		 
		 System.out.print("Enter Principal Amount  : ");
		 int  p = sc.nextInt();
		 System.out.print("Enter  Rate of Interest per year  : ");
		 int  r = sc.nextInt();
		 System.out.print("Enter Time period in terms of year : ");
		 int  t = sc.nextInt();
		 System.out.println(" ");
		 System.out.println("-----------------------------------------------------");
		 si=(p*r*t)/100.0;
		 System.out.println("The Simpale Interest on amount "+p+" with Intrest rate "+r+" for "+t+" year time period is  : "+si);
		 
}
}
		 