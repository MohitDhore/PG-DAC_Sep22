class P10{
public static void main(String args[]){

         
    for (int i=5;i>=1;i--)
   {
	  char a=65;
	   for(int j=1;j<=i;j++)//space
	 {
	 System.out.print(" ");
	 
	 }
	for(int j=1;j<i;j++)
	 {
	    a++;
	 }
     for(int j=i;j<=5;j++)
	 {
	    System.out.print(a+" ");
	 a++;
	 }
	 
	 	   
    System.out.println();
   }
}
}
/*output
     E
    D E
   C D E
  B C D E
 A B C D E
 
 */