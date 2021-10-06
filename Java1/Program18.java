//Java Program to determine whether two strings are the anagram
import java.util.*;
class Program18
{
	public static void main(String args[])
	{
		String str1="Grab";
		String str2="Brag";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length())
			System.out.println("Strings are not anagram");
		else
		{	
		
		
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
			if(Arrays.equals(ch1,ch2)==true)
				System.out.println("Strings are anagram");
			else
				System.out.println("Strings are not anagram");
		}			
	}
}

/************************************************************OR**********************************************************************/
import java.util.*;
class Program18
{
	public static void main(String args[])
	{
		String str1="grabb";
		String str2="Grabb";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Strings are not anagram");
		}
		
		int arr[]=new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		for(int i=0;i<ch1.length;i++)
		{
			arr[ch1[i]-'a']++;
			arr[ch2[i]-'a']--;
		}
	
		int i;
		for(i=0;i<26;i++)
		{
			if(arr[i]!=0)
			{
				break;
			}
		}
		
		if(i==26)
			System.out.println("Strings are anagram");
		else
			System.out.println("Strings are not anagram");
	}
}

