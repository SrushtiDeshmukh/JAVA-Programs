//Java Program to print smallest and biggest possible palindrome word in a given string
public class Program36
{
	public static void main(String args[])
	{
		String str="Ana Arora Madam is a teaches malayalam";
		str=str.toLowerCase();
		String words[]=str.split(" ");
		String Palindrome[]=new String[str.length()];
		String rev;
		String str2="";
		int temp=0;
		
		for(int i=0;i<words.length;i++)
		{
			rev="";
			str2=words[i];
			for(int j=str2.length()-1;j>=0;j--)
			{
				rev=rev+str2.charAt(j);
			}
			
			if(words[i].equals(rev))
				Palindrome[temp++]=rev;
		}
		
		String min=Palindrome[0],max=Palindrome[0];
		for(int i=1;i<temp;i++)
		{
			if(Palindrome[i].length()<min.length())
				min=Palindrome[i];
				
			if(Palindrome[i].length()>max.length())
				max=Palindrome[i];
		}
		System.out.println("smallest palindrome word - "+min);
		System.out.println("largestst palindrome word - "+max);
	}
}
