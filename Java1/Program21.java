//Java Program to find all subsets of a string
class Program21
{
	public static void main(String args[])
	{
		String str="Funo";
		int len=str.length();
		String arr[]=new String[len*(len+1)/2];
		int temp=0;
		
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				arr[temp]=str.substring(i,j+1);
				temp++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
