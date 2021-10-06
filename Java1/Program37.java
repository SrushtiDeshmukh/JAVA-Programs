// Reverse a String in Java Word by Word
public class Program37
{
	public static void main(String args[])
	{
		String str="I am going to market";
		str=str.toLowerCase();
		String words[]=str.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			StringBuilder sb=new StringBuilder(words[i]);
			System.out.print(sb.reverse()+" ");
		}
		System.out.println();
	}
}

/**********************************************************OR******************************************************************/
public class Program37
{
	public static void main(String args[])
	{
		String str="I am going to market";
		str=str.toLowerCase();
		String words[]=str.split(" ");
		
		StringBuilder sb=new StringBuilder(str);
		System.out.print(sb.reverse()+" ");
		System.out.println();
	}
}

