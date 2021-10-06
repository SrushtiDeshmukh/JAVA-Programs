//Fibonacci series using for loop
class Program1
{
	public static void main(String args[])
	{
		int n1=0,n2=1,n3,num=6;
		for(int i=1;i<=num;i++)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		System.out.println();
	}
}


/********************************************************************OR*********************************************************************/
//Fibonacci series using recurssion
import java.util.*;
class Program1
{  
	static int n1=0,n2=1,n3=0;    
     	static void printFibonacci(int count){    
        if(count>0)
        {    
             n3 = n1 + n2;    
             n1 = n2;    
             n2 = n3;    
             System.out.print(" "+n3);   
             printFibonacci(count-1);    
         }    
     }  
       
      public static void main(String args[])
      {   
      	Scanner sobj=new Scanner(System.in);
	System.out.println("Enter num");
	int num=sobj.nextInt();   
      	System.out.print(n1+" "+n2);//printing 0 and 1    
      	printFibonacci(num-2);//n-2 because 2 numbers are already printed   
      }  
}  

