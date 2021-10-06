//Java Program to find Largest Number in an Array
class Program12
{
	public static void main(String args[])
	{
		int arr[]=new int[]{5, 2, 8, 7, 1};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Maximum element is "+max);
	}
}


/************************************************************OR**********************************************************************/
class Program11
{
	public static void main(String args[])
	{
		int arr[]=new int[]{5, 2, 8, 7, 1};
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("Maximum element is "+arr[arr.length-1]);
	}
}
