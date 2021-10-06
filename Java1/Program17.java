//Java Program to count the total number of characters in a string
import java.util.*;
class Program17
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sobj.nextLine();
		
		System.out.println(str.length());
	}
}

/********************************************************OR**************************************************************************/
import java.util.*;
class Program17
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sobj.nextLine();
		char ch[]=str.toCharArray();
		
		System.out.println(ch.length);
	}
}

/*********************************************************OR***************************************************************************/
//only characters not white spaces
import java.util.Scanner;
class Program17
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sobj.nextLine();
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
				count++;
		}
		System.out.println(count);
	}
}
