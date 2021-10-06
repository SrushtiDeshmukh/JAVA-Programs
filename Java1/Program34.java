//Java Program to find the most repeated word in a text file
class Program34
{
	public static void main(String args[])
	{
		String str="Min and mina likes ice but min likes more min is silent min is boy";
		String words[]=str.split(" ");
		int freq[]=new int[words.length];
		int i,j;
		
		for(i=0;i<words.length;i++)
		{
			freq[i]=1;
			for(j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]) && words[i]!="0")
				{
					freq[i]++;
					words[j]="0";
				}
			}
		}
		int max=freq[0],index=0;
		for(i=0;i<freq.length;i++)
		{
			if(max<freq[i])
			{	max=freq[i];
				index=i; }
		}
		System.out.println(words[index]);
	}
}
