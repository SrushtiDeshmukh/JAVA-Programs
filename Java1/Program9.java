//Program to print the duplicate elements of an array
import java.util.*;
class Program9
{
	public static void main(String args[])
	{
		int arr[]=new int[8];
		int duparr[]=new int[arr.length];
		int l=0,flag=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.nextInt();
		}
		
		System.out.println("Dublicate elements are");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					for(int k=0;k<duparr.length;k++)
					{
						flag=1;
						if(duparr[k]==arr[i])
						{	flag=0;break;
						}
					}
					if(flag==1)
						duparr[l++]=arr[i];
				}
			}
		}
		
		for(int i=0;i<l;i++)
			System.out.print(duparr[i]+" ");
	}	
}


/***********************************************************OR*******************************************************/
import java.util.*;
class Program9
{
	public static void main(String args[])
	{
		int arr[]=new int[8];
		int count=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.nextInt();
		}
		
		System.out.println("Dublicate elements are");
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && arr[i]!=-1)
				{
					count++;
					arr[j]=-1;
				}
			}
			if(count>1 && arr[i]!=-1)
				System.out.print(arr[i]+" ");
		}
			
	}	
}

/**************************************************************OR*********************************************************/
//only for that type of array which contains one single unique element & all othe elemnts in pair
class Program9
{
	public static void main(String args[])
	{
		int arr[]=new int[]{2,3,2,3,4,5,5};
		int result=0;
		for(int i=0;i<arr.length;i++)	
		{	
			result=1^arr[i];
			
		}
		System.out.println(result);
	}
}

