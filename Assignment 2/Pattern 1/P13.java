
class P13{
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
	 
	 }
	 
	 	   a++;
    System.out.println();
   }
  
}
}


/*output
    A
   B B
  C C C
 D D D D
E E E E E


*/