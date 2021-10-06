//Java Program to print palindrome words in string

public class Program35
{
	public static void main(String args[])
	{
		String str="Madam arora teaches malayalam";
		str=str.toLowerCase();
		String words[]=str.split(" ");
		String rev;
		String str2="";
		
		for(int i=0;i<words.length;i++)
		{
			rev="";
			str2=words[i];
			for(int j=str2.length()-1;j>=0;j--)
			{
				rev=rev+str2.charAt(j);
			}
					
			if(words[i].equals(rev))
				System.out.println(words[i]);
		}
		
	}
}

