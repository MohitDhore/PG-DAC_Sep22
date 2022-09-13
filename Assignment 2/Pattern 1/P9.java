
class P9{
public static void main(String args[]){

        char a=65;
    for (int i=1;i<=5;i++)
   {
	   for(int j=4;j>=i;j--)//space
	 {
	 System.out.print(" ");
	 
	 }
   
	 for(int j=1;j<=i;j++)
	 {
	 System.out.print(a+" ");
	 a++;
	 }
	 
	 a=65;	   
    System.out.println();
   }
}
}


/*output
    A
   A B
  A B C
 A B C D
A B C D E


*/