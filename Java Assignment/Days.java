/*
05.	Write a program to read the days (eg. 670 days) as integer value
 using Scanner class. Now convert the entered days into complete years,
 months and days and print them.
*/
import java.util.*;

class Days{

	public static void main (String args[])
	{
	
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter the Numner of day you want to convert : ");
	int days = sc.nextInt();
	
	int year = days/365;
	int y = days%365;
	
	int month = y/30;
	  int m=y%30;
	  
    System.out.println("-----------------------------------------------------");
    System.out.println("Total "+days+" days means a Complete "+year+" Year and "+month+" Month and "+m+" Days. ");
	
	
	
	
	
	
	}
	
}