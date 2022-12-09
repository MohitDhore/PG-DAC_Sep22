/*
08.	In a company an employee is paid as under: If his basic salary is less than Rs. 10000,
 then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 10000, 
 then HRA = Rs. 2000 and DA = 98% of basic salary. If the employee's salary is input by the user 
 write a program to find his gross salary.
 [ formula : GS= Basic + DA + HRA ]

*/
import java.util.*;
class Company{

	public static void main (String args[])
	{
	  Scanner sc =new Scanner(System.in);
	  System.out.print(" Enter Basic Salary : ");
	   int basicSalary = sc.nextInt();
	   double hra;
	   double da;
	   
	   if(basicSalary<10000)
	   {
		   hra = basicSalary * 0.10;
		   da =basicSalary * 0.90;
	   }
	  else 
	  {
		  hra = 2000;
		   da =basicSalary * 0.98;
	  }
	  double gs =basicSalary+da+hra;
	  System.out.println(" --------------------------------------------- ");
	  System.out.println(" Basic Salary is = "+basicSalary);
	  System.out.println(" HRA is = "+hra);
      System.out.println(" DA is = "+da);
	  System.out.println(" GS is = "+gs);


	  
	}
}	