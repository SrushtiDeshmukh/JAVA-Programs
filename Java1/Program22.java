//Java Program to remove all the white spaces from a string
class Program22
{
	public static void main(String args[])
	{
		String str="Remove  all whi  te spaces";
		char ch2[]=str.toCharArray();
		String str2="";
		
		for(int i=0;i<ch2.length;i++)
		{
			if(ch2[i]!=' ')
				str2=str2+ch2[i];
		}
		
		System.out.println(str2);
	}
}


/************************************************************OR*******************************************************************/
class Program22
{
	public static void main(String args[])
	{
		String str="Remove  all whi  te spaces";
		String str2="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
				str2=str2+str.charAt(i);
		}
		System.out.println(str2);
	}
}


/***********************************************************OR***********************************************************************/
class Program22
{
	public static void main(String args[])
	{
		String str="Remove    all whi  te spaces";
		
		str=str.replaceAll("\s","");
		System.out.println(str);
	}
}

