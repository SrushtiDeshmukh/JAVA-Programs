//java Program to find second Largest Number in an Array
class Program13
{
	public static void main(String args[])
	{
		int arr[]=new int[]{5, 2, 8, 7, 1, 9, 3, 8, 9};
		int max=0,sec_max=0;
		
		if(arr[0]>arr[1])
		{
			max=arr[0];
			sec_max=arr[1];
		}
		else if(arr[0]<arr[1])
		{
			max=arr[1];
			sec_max=arr[0];
		}
		
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				sec_max=max;
				max=arr[i];
			}
			else if(arr[i]>sec_max && arr[i]!=max)
			{
				sec_max=arr[i];
			}
		}
		System.out.println("Second max element is "+sec_max);
	}
}
