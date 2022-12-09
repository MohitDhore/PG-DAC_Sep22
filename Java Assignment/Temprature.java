/*
06.	Write a program to convert temperature from Fahrenheit to Celsius.
    Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]

*/
import java.util.*;
class Temprature{

	public static void main (String args[])
	{
	
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter the Temprature in Fahrenheit : ");
	double f = sc.nextInt();
	
	
	double C= 5*(f-32)/9.0;
	
	
	  
    System.out.println("-----------------------------------------------------");
    System.out.println(" Temrature after converting Fahrenheit to Celsius : "+C);
	
	
	
	
	
	
	}
	
} 