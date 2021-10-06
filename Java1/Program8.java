//Program to find the frequency of each element in the array
class Program8
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,2,8,3,2,2,2,5,1};
		int freq[]=new int[arr.length];
		int visited=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					freq[j]=visited;
				}
			}
			
			if(freq[i]!=visited)
				freq[i]=count;
		}
		
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]!=visited)
				System.out.println(arr[i]+"  "+freq[i]);
		}
		
		int max=freq[0],index=0;
		for(int i=0;i<freq.length;i++)
		{
			if(max<freq[i])
			{	max=freq[i];
				index=i;	}
		}
		System.out.println("Most repeating element is "+arr[index]);
	}
}

/****************************************************************OR******************************************************************/
class Program8
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,2,8,3,2,2,2,5,1};
		int freq[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			freq[i]=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					freq[i]++;
					arr[j]='a';
				}
			}
			
			if(freq[i]>0 && arr[i]!='a')
				System.out.println(arr[i]+"  "+freq[i]);
		}
		

		
		int max=freq[0],index=0;
		for(int i=0;i<freq.length;i++)
		{
			if(max<freq[i])
			{	max=freq[i];
				index=i;	}
		}
		System.out.println("Most repeating element is "+arr[index]);
	}
}
