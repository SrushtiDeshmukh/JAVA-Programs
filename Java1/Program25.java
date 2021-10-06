//Java Program to determine whether a given string is palindrome
class Program25
{
	public static void main(String args[])
	{
		String str="Nitin";
		str=str.toLowerCase();
		String str2;
		char ch[]=str.toCharArray();
		char temp;
		
		for(int i=0,j=1;i<(ch.length/2);i++,j++)
		{
			temp=ch[i];
			ch[i]=ch[ch.length-j];
			ch[ch.length-j]=temp;
		}
		str2=String.valueOf(ch);
		if(str.equals(str2))
			System.out.println("Palindrome");
	}
}


/*****************************************************************OR**********************************************************************/
class Program25
{
	public static void main(String args[])
	{
		String str="abccbaa";
		str=str.toLowerCase();
		int flag=0;
		
		for(int i=0;i<(str.length()/2);i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
				flag=1;
				
		}
		if(flag==0)
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}
}


