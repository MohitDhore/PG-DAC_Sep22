
/*
07.	Write a program to swap two numbers without using third variable.
*/
import java.util.*;
class Swap{

	public static void main (String args[])
	{
	 Scanner sc =new Scanner(System.in);
	System.out.print("Enter the First Number: ");
	int a = sc.nextInt();
	System.out.print("Enter the Second  Number: ");
	int b = sc.nextInt();
	
	   a=a+b;
	   b=a-b;
	   a=a-b;
	   
	    System.out.println(" ----------------------------------------");
	    System.out.println(" Number After Swapping -->");
	   System.out.println(" First Number:  "+a);
	   System.out.println(" Second  Number: "+b);
	
	}
	
}