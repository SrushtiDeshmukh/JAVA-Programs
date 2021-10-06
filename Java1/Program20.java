//Java Program to divide a string in 'N' equal parts.
class Program20
{
	public static void main(String args[])
	{
		String str="aaabbbccc";
		int n=3,j=0;
		int len=str.length();
		int chars=len/n;
		String eqlparts[]=new String[n];
		
		if(len%n!=0)
		{
			System.out.println("String can not be convert into equal parts");
		}
		else
		{
			for(int i=0;i<len;i=i+chars)
			{
				String part=str.substring(i,i+chars);
				eqlparts[j]=part;
				j++;
			}
		}
		for(int i=0;i<eqlparts.length;i++)
		{
			System.out.println(eqlparts[i]);
		}
	}
}
