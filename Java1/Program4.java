//factorial using for loop
import java.util.*;
class Program4
{
	static void factorial(int num)
	{
		int fact=1;
		if(num==0)
			System.out.println("1");
		else
		{
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.println(fact);
		}
	}
	
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sobj.nextInt();
		
		factorial(num);
	}
}


/*****************************************************************OR***************************************************************/

//factorial using recursion
import java.util.*;
class Program4
{
	static int fact=1;
	static int factorial(int num)
	{
		if(num==0)
			return 1;
			
		if(num>1)
		{
			fact=fact*num;
			factorial(num-1);
		}
		return fact;
	}
	
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sobj.nextInt();
		int fact=factorial(num);
		System.out.println(fact);
	}
}

