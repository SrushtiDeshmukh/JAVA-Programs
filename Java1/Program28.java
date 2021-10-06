//Java Program to find Reverse of the string
public class Program28
{
	public static void main(String args[])
	{
		String str="Srushti Deshmukh";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
}

/***********************************************************OR****************************************************************/
public class Program28
{
	public static void main(String args[])
	{
		String str="Srushti Deshmukh";
		StringBuffer sb=new StringBuffer(str);
		
		System.out.println(sb.reverse());
	}
}

