/*
02.	Write a program that takes radius of a circle as input. 
Read the entered radius using Scanner class. 
Then calculate and print the area and circumference of the circle.
*/

import java.util.*;

class Circle{
public static void main(String args[]){
	
  System.out.println("Enter the RAdius of circle : ");
  Scanner sc = new Scanner(System.in);
  int  radius = sc.nextInt();
  float area = radius*radius;
  float  circum= (float) (2 * 3.14 * radius);
  System.out.println("Area of a Circle is : "+area);
  System.out.println("Circumferance of a Circle is : "+circum);
  
}

}