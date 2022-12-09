/*
03.	Write a program to calculate sum of 5 subject’s marks & find percentage. 
Take the obtained marks from user using Scanner class. 
Output should be in this format [ percentage marks = 99 % ].
 Use concatenation operator here.
 
 */
 import java.util.*;
 
 class Percentage{
	 public static void main(String args[])
	 {
		 Scanner sc = new Scanner(System.in);
         int i;
		 int avg=0;
		 int sum=0;
		 for(i=1;i<=5;i++)
		 {
		 System.out.print("Enter the Mark of Subjest "+i+" : ");
		  int  marks = sc.nextInt();
		  sum = sum + marks;
		  //avg = ((sum)/5);
	     }
		 
		 System.out.println("----------------------------------------");
	 	 System.out.println("Sum of all subjects is = "+sum);
		 
		 double percet = (sum /500.0)*100.0;
		         // percet = percet *100.0;
		 System.out.println("percentage marks = "+percet+" % ");
		 
	 }
	 
	 
 }