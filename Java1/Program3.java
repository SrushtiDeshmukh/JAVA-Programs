//Palindrome number or not
import java.util.*;
class Program3
{
	static void palindrome(int num)
	{
		int rev=0,temp=num;
		while(num>0)
		{
			rev=(rev*10)+(num%10);
			num=num/10;
		}
		
		if(temp==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sobj.nextInt();
		palindrome(num);
	}
}


/*******************************************************************OR********************************************************/

//Palindrome String or not
import java.util.*;

class Program3
{
	static void palindrome(String str)
	{
		str=str.toLowerCase();
		char arr[]=str.toCharArray();
		String str2="";
		
		for(int i=arr.length-1;i>=0;i--)
		{
			str2=str2+arr[i];
		}
		
		if(str.equals(str2))
			System.out.println("Palindrome string");
		else
			System.out.println("Not Palindrome string");
		
	}
	
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sobj.nextLine();
		palindrome(str);
	}
}

