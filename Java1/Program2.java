//Program to check Prime no or not.
import java.util.*;
class Program2
{
	static void checkPrime(int num)
	{
		int flag=0;
		if(num==0 || num==1)
		{
			System.out.println("Not Prime");
		}
		else
		{
			for(int i=2;i<=(num/2);i++)
			{	
				if(num%i==0)
					flag=1;
			}
		}
		
		if(flag==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");		
	}
	
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		int num=sobj.nextInt();
		checkPrime(num);
	}
}
